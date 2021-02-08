package ua.od.ones.service;

import ua.od.ones.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService extends GenericService<Role>{

    @Override
    Role create(Role role);

    @Override
    boolean update(Role role);

    @Override
    Optional<Role> getById(long id);

    @Override
    List<Role> getAll();
}
