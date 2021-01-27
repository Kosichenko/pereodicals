package ua.od.ones.model.service;

import ua.od.ones.model.entity.Theme;

import java.util.List;
import java.util.Optional;

public interface ThemeService extends GenericService<Theme> {

    @Override
    Theme create(Theme theme);

    @Override
    boolean update(Theme theme);

    @Override
    Optional<Theme> getById(long id);

    @Override
    List<Theme> getAll();
}
