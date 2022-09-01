package com.blog.controller;

import com.blog.model.Catalogy;
import com.blog.service.ICatalogyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatalogyRestController {
    @Autowired
    private ICatalogyService catalogyService;
    @GetMapping("/listCategory")
    public ResponseEntity<List<Catalogy>> goCategory() {
        List<Catalogy> categoryList= catalogyService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }
    @GetMapping("/detailCategory")
    public  ResponseEntity<Catalogy> goDetail(@RequestParam Integer id){
        Catalogy catalogy = catalogyService.findById(id);
        if (catalogy == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(catalogy, HttpStatus.OK);
    }
}
