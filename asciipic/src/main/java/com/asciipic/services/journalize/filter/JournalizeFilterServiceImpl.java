package com.asciipic.services.journalize.filter;

import com.asciipic.models.JournalizeFilter;
import com.asciipic.repositories.JournalizeFilterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class JournalizeFilterServiceImpl implements JournalizeFilterService {
    @Autowired
    private JournalizeFilterRepository repository;

    @Override
    public JournalizeFilter save(JournalizeFilter entity) {
        return this.repository.save(entity);
    }
}
