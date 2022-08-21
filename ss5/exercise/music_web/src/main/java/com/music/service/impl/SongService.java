package com.music.service.impl;

import com.music.model.Song;
import com.music.repository.ISongRepository;
import com.music.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository repository;

    @Override
    public List<Song> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Song song) {
        repository.save(song);

    }

    @Override
    public Song findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(Song song) {
        repository.update(song);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}
