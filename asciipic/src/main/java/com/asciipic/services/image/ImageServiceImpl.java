package com.asciipic.services.image;

import com.asciipic.models.Image;
import com.asciipic.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository repository;

    @Override
    public List<Image> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Image getById(Long id) {
        return this.repository.findOne(id);
    }

    @Override
    public Image save(Image entity) {
        return this.repository.save(entity);
    }

}
