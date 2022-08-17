package com.mail.service.impl;

import com.mail.model.MailConfiguration;
import com.mail.repository.IMailRepository;
import com.mail.service.IMailConfigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailConfigureService implements IMailConfigureService {
    @Autowired
    private IMailRepository mailRepository;

    @Override
    public List<MailConfiguration> save(MailConfiguration mailConfiguration) {
        return mailRepository.save(mailConfiguration);
    }

    @Override
    public List<String> showAllLanguage() {
        return mailRepository.showAllLanguage();
    }

    @Override
    public List<Integer> showAllSize() {
        return mailRepository.showAllSize();
    }


}
