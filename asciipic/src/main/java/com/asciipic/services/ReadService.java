package com.asciipic.services;

import java.util.List;

public interface ReadService<T> {
    List<T> getAll();

    T getById(Long id);
}