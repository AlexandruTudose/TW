package com.asciipic.services.journalize.register;

import com.asciipic.models.JournalizeRegister;
import com.asciipic.repositories.JournalizeRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class JournalizeRegisterServiceImpl implements JournalizeRegisterService {
    @Autowired
    private JournalizeRegisterRepository repository;

    @Override
    public JournalizeRegister save(JournalizeRegister entity) {
        return this.repository.save(entity);
    }
}
