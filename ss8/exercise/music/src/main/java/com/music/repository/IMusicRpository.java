package com.music.repository;

import com.music.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRpository extends JpaRepository<Music,Integer> {
    Page<Music> findAllByNameContaining(String name, Pageable pageable);
}
