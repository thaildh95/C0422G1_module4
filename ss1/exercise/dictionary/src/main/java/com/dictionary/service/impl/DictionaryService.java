package com.dictionary.service.impl;

import com.dictionary.repository.IDictionaryRepositoryService;
import com.dictionary.repository.impl.DictionaryRepositoryService;
import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DictionaryService implements IDictionaryService {
        @Autowired
        IDictionaryRepositoryService repositoryService;
    @Override
    public String findWord(String name) {
        return repositoryService.findWord(name);
    }
}

