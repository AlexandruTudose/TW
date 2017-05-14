package com.asciipic.services.user;

import com.asciipic.models.User;
import com.asciipic.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAll() {
        return this.repository.findAll();
    }

    @Override
    public User getById(Long id) {
        return this.repository.findOne(id);
    }
}