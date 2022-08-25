package com.music.service;

import com.music.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface IMusicService {
    Page<Music> findAllByName(String name, Pageable pageable);

    Music save(Music music);
    Music findById(int id);
}