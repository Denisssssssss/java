package ru.itis.javalab.repositories;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {

    void save(T entity);
    void update(T entity);
    Optional<T> findById(Long id);
    List<T> findAll();
    List<T> findAll(int page, int size);
}
