package com.phone.controller;

import com.phone.model.Smartphone;
import com.phone.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/smartphones")
public class SmartphoneController {
    @Autowired
    private ISmartphoneService smartphoneService;

    @GetMapping("/list")
    public ResponseEntity<Page<Smartphone>> goPage(@PageableDefault(6) Pageable pageable,
                                                   @RequestParam Optional<String> name) {

        String keyName = name.orElse("");
        Page<Smartphone> smartphonePage = smartphoneService.findAll(pageable, keyName);
        if (!smartphonePage.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(smartphonePage, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Page<Smartphone>> create(@RequestBody Smartphone smartphone) {
        smartphoneService.save(smartphone);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/update/{id}")
    public ResponseEntity<?> goUpdate(@PathVariable String id) {
        Smartphone smartphone = smartphoneService.findById(Integer.valueOf(id));
        return new ResponseEntity<>(smartphone, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Smartphone> update(@RequestBody Smartphone smartphone, @RequestParam Integer id) {
        smartphone.setId(smartphone.getId());
        smartphoneService.save(smartphone);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<Void> goDelete(@PathVariable Integer id) {
        smartphoneService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
