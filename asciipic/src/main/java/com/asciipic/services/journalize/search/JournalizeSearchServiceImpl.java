package com.asciipic.services.journalize.search;

import com.asciipic.models.JournalizeSearch;
import com.asciipic.repositories.JournalizeSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Alexandru on 5/14/2017.
 */
public class JournalizeSearchServiceImpl implements JournalizeSearchService {
    @Autowired
    private JournalizeSearchRepository repository;

    @Override
    public JournalizeSearch save(JournalizeSearch entity) {
        return this.repository.save(entity);
    }
}
