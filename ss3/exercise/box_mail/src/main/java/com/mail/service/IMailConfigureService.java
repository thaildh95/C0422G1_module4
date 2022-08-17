package com.mail.service;

import com.mail.model.MailConfiguration;

import java.util.List;

public interface IMailConfigureService {
    List<MailConfiguration> save(MailConfiguration mailConfiguration);
    List<String> showAllLanguage();
    List<Integer>showAllSize();


}
