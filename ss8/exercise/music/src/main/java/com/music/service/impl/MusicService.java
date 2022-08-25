package com.music.service.impl;

import com.music.model.Music;
import com.music.repository.IMusicRpository;
import com.music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRpository repository;

    @Override
    public Music findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Music save(Music music) {
        return repository.save(music) ;
    }

    @Override
    public Page<Music> findAllByName(String name, Pageable pageable) {
        return repository.findAllByNameContaining(name,pageable);
    }
}
