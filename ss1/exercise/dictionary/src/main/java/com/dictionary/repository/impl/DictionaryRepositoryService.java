package com.dictionary.repository.impl;

import com.dictionary.repository.IDictionaryRepositoryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryRepositoryService implements IDictionaryRepositoryService {
    private static Map<String, String> dictionaryList = new HashMap<>();

    static {
        dictionaryList.put("cat", "mèo");
        dictionaryList.put("dog", "chó");
        dictionaryList.put("orange", "cam");
        dictionaryList.put("apple", "táo");
        dictionaryList.put("duriant", "sầu riêng");
        dictionaryList.put("banana", "chuối");
        dictionaryList.put("watermelon", "dưa hấu");
        dictionaryList.put("mangoes", "xoài");
        dictionaryList.put("lemond", "chanh");

    }

    @Override
    public String findWord(String name) {
        String result = dictionaryList.get(name);
        if (result == null) {
            result = "khong thay";

        }
        return result;
    }
}