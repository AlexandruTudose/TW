package com.asciipic.services.saved_image;

import com.asciipic.models.SavedImage;
import com.asciipic.repositories.SavedImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class SavedImageServiceImpl implements SavedImageService {
    @Autowired
    private SavedImageRepository repository;

    @Override
    public List<SavedImage> getAll() {
        return this.repository.findAll();
    }

    @Override
    public SavedImage getById(Long id) {
        return this.repository.findOne(id);
    }

    @Override
    public SavedImage save(SavedImage entity) {
        return this.repository.save(entity);
    }

}
