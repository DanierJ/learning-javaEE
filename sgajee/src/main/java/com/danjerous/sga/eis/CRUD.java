package com.danjerous.sga.eis;

import java.util.List;

public interface CRUD<T> {
    List<T> findAll();

    T findById(T entity);

    void insert(T entity);

    void update(T entity);

    void delete(T entity);
}
