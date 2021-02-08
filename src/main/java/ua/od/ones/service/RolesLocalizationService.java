package ua.od.ones.service;

import ua.od.ones.entity.Role;
import ua.od.ones.entity.RolesLocalization;

import java.util.List;
import java.util.Optional;

public interface RolesLocalizationService extends GenericService<RolesLocalization> {

    RolesLocalization create(RolesLocalization rolesLocalization);

    boolean update(RolesLocalization rolesLocalization);

    Optional<RolesLocalization> getById(long id);

    List<RolesLocalization> getAll();

    Role getByRole(String test);
}
