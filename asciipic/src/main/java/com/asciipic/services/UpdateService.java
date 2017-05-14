package com.asciipic.services;

/**
 * Created by Alexandru on 5/14/2017.
 */
public interface UpdateService<T> {
    T save(T entity);
}