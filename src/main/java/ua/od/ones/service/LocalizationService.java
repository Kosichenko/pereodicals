package ua.od.ones.service;

import ua.od.ones.entity.Localization;

import java.util.List;
import java.util.Optional;

public interface LocalizationService extends GenericService<Localization> {

    @Override
    Localization create(Localization localization);

    @Override
    boolean update(Localization localization);

    @Override
    Optional<Localization> getById(long id);

    @Override
    List<Localization> getAll();
}
