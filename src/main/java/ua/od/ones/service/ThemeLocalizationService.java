package ua.od.ones.service;

import ua.od.ones.entity.ThemeLocalization;

import java.util.List;
import java.util.Optional;

public interface ThemeLocalizationService extends GenericService<ThemeLocalization> {

    @Override
    ThemeLocalization create(ThemeLocalization themeLocalization);

    @Override
    boolean update(ThemeLocalization themeLocalization);

    @Override
    Optional<ThemeLocalization> getById(long id);

    @Override
    List<ThemeLocalization> getAll();
}
