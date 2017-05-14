package com.asciipic.services;

import com.asciipic.models.User;
import com.asciipic.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestModelServiceImpl implements TestModelService {
    @Autowired
    private UserRepository repository;

    @Override
    public User save(User entity) {
        return this.repository.save(entity);
    }

    @Override
    public List<User> getAll() {
        return this.repository.findAll();
    }

    @Override
    public User getById(Long id) {
        return this.repository.findOne(id);
    }

    @Override
    public void delete(Long id) {
        this.repository.delete(id);
    }
}
