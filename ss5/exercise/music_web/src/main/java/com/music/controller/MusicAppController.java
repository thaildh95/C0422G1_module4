package com.music.controller;

import com.music.model.Song;
import com.music.model.SongForm;
import com.music.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class MusicAppController {
    @Value("${file-upload}")
    private String fileUpload;

    @Autowired
    private ISongService service;

    @GetMapping("/")
    public String goHome(Model model) {
        model.addAttribute("songList", service.findAll());
        return "home";
    }

    @GetMapping("/add")
    public String goAdd(Model model) {
        model.addAttribute("songForm", new SongForm());
        return "add";
    }

    @PostMapping("/save")
    public String goSave(@ModelAttribute("songForm") SongForm songForm) {
        MultipartFile multipartFile = songForm.getPath();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(multipartFile.getBytes(), new File(fileUpload + fileName));

        } catch (IOException e) {
            e.printStackTrace();
        }
        Song song = new Song(songForm.getName(), songForm.getArtist(), songForm.getType(), fileName);
        service.save(song);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String goUpdate(@RequestParam int id, Model model) {
        Song song = service.findById(id);
        SongForm songForm = new SongForm();
        BeanUtils.copyProperties(songForm, song);
        model.addAttribute("songForm", songForm);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute SongForm songForm) {
        Song afterUpdateSong = service.findById(songForm.getId());
        MultipartFile multipartFile = songForm.getPath();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(multipartFile.getBytes(), new File(fileUpload + fileName));

        } catch (IOException e) {
            e.printStackTrace();
        }
        Song song = new Song(songForm.getName(), songForm.getArtist(), songForm.getType(), fileName);
        service.save(song);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id) {
        service.delete(id);
        return "redirect:/";
    }

    @GetMapping("/listen")
    public String listen(@RequestParam int id, Model model) {
        model.addAttribute("song", service.findById(id));
        return "listen";
    }
}
