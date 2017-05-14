package com.asciipic.services.journalize.login;

import com.asciipic.models.JournalizeLogin;
import com.asciipic.repositories.JournalizeLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class JournalizeLoginServiceImpl implements JournalizeLoginService {
    @Autowired
    private JournalizeLoginRepository repository;

    @Override
    public JournalizeLogin save(JournalizeLogin entity) {
        return this.repository.save(entity);
    }
}
