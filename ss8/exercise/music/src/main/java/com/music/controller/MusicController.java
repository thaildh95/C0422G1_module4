package com.music.controller;

import com.music.dto.MusicDto;
import com.music.model.Music;
import com.music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Optional;

@Controller
@PropertySource("classpath:upload-file.properties")
public class MusicController {
    @Autowired
    private IMusicService service;

    @Value("${file-upload}")
    private String fileUpload;

    @GetMapping("/")
    public String goList(@PageableDefault(value = 4) Pageable pageable,
                         Model model,
                         @RequestParam Optional<String> name) {

        String nameValue = name.orElse("");
        model.addAttribute("songList", service.findAllByName(nameValue, pageable));
        return "/list";
    }

    @GetMapping("/add")
    public String goAdd(Model model) {
        model.addAttribute("songList", new MusicDto());
        return "add";
    }

    @PostMapping("/save")
    public String add(@ModelAttribute @Valid MusicDto musicDto,
                      BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "add";
        }
        Music oldMusic =service.findById(musicDto.getId());
        MultipartFile multipartFile = musicDto.getLink();
        String file = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(multipartFile.getBytes(),new File(fileUpload + file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Music music = new Music(musicDto.getName(), musicDto.getSinger(), file);
        if (music.getLink().equals("")){
            music.setLink(oldMusic.getLink());
        }
        service.save(music);
        return "redirect:/";
    }
    @GetMapping("/update")
    public String goUpdate(@RequestParam int id,Model model){
        model.addAttribute("musicDto", service.findById(id));
        return "/update";
    }
    @PostMapping("/update")
    public String updarte(@ModelAttribute @Valid MusicDto musicDto,
                      BindingResult bindingResult){
        MultipartFile multipartFile = musicDto.getLink();
        String file = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(multipartFile.getBytes(),new File(fileUpload + file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Music music = new Music(musicDto.getName(), musicDto.getSinger(), file);
        service.save(music);
        return "redirect:/";
    }
}
