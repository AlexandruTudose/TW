package com.asciipic.services.journalize;

import com.asciipic.models.Journalize;
import com.asciipic.repositories.JournalizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class JournalizeServiceImpl implements JournalizeService {
    @Autowired
    private JournalizeRepository repository;

    @Override
    public Journalize save(Journalize entity) {
        return this.repository.save(entity);
    }

    @Override
    public List<Journalize> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Journalize getById(Long id) {
        return this.repository.findOne(id);
    }
}
