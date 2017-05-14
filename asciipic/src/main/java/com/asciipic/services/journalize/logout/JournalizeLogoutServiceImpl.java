package com.asciipic.services.journalize.logout;

import com.asciipic.models.JournalizeLogout;
import com.asciipic.repositories.JournalizeLogoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class JournalizeLogoutServiceImpl implements JournalizeLogoutService {
    @Autowired
    private JournalizeLogoutRepository repository;

    @Override
    public JournalizeLogout save(JournalizeLogout entity) {
        return this.repository.save(entity);
    }
}
