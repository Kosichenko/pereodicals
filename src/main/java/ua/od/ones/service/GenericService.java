package ua.od.ones.service;

import java.util.List;
import java.util.Optional;

public interface GenericService<T> {
    T create(T object);

    boolean update(T object);

    List<T> getAll();

    Optional<T> getById(long id);

    boolean delete(long id);

    boolean isExists(long id);
}
