package com.mail.repository.impl;

import com.mail.model.MailConfiguration;
import com.mail.repository.IMailRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository implements IMailRepository {
    private static List<MailConfiguration> configurations = new ArrayList<>();

    private static List<String> language = new ArrayList<>();

    static {
        language.add("Viet Nam");
        language.add("French");
        language.add("Italy");
        language.add("India");
        language.add("Cambodia");
        language.add("Spanish");
        language.add("Sturgar");
        language.add("English");
    }

    private static List<Integer> size = new ArrayList<>();

    static {
        size.add(10);
        size.add(20);
        size.add(30);
        size.add(40);
        size.add(50);
        size.add(60);
        size.add(70);
        size.add(80);
        size.add(90);
    }

    @Override
    public List<MailConfiguration> save(MailConfiguration mailConfiguration) {
        configurations.add(mailConfiguration);
        return configurations;
    }

    @Override
    public List<String> showAllLanguage() {
        return language;
    }

    @Override
    public List<Integer> showAllSize() {
        return size;
    }
}
