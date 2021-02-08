package ua.od.ones.service;

import ua.od.ones.entity.RolesLocalization;

import java.util.List;
import java.util.Optional;

public interface RolesLocalizationService extends GenericService<RolesLocalization> {

    @Override
    RolesLocalization create(RolesLocalization rolesLocalization);

    @Override
    boolean update(RolesLocalization rolesLocalization);

    @Override
    Optional<RolesLocalization> getById(long id);

    @Override
    List<RolesLocalization> getAll();
}
