package com.mail.repository;

import com.mail.model.MailConfiguration;

import java.util.List;

public interface IMailRepository {
    List<MailConfiguration> save(MailConfiguration mailConfiguration);
    List<String> showAllLanguage();
    List<Integer>showAllSize();

}
