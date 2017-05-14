package com.asciipic.services.tag;

import com.asciipic.models.Tag;
import com.asciipic.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class TagServiceImpl implements TagService{

    @Autowired
    private TagRepository repository;

    @Override
    public List<Tag> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Tag getById(Long id) {
        return this.repository.findOne(id);
    }

    @Override
    public Tag save(Tag entity) {
        return this.repository.save(entity);
    }
}
