package ua.od.ones.model.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.model.entity.Role;
import ua.od.ones.model.repository.RoleRepository;
import ua.od.ones.model.service.RoleService;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository repository;

    @Autowired
    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean delete(long id) {
        if(isExists(id)) {
            repository.deleteById(id);
        }
        return false;
    }

    @Override
    public boolean isExists(long id) {
        return repository.existsById(id);
    }

    @Override
    public Role create(Role role) {
        if(role.getId() == 0) {
            return repository.saveAndFlush(role);
        }
        return role;
    }

    @Override
    public boolean update(Role role) {
        if(role.getId() == 0) {
            repository.saveAndFlush(role);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Role> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<Role> getAll() {
        return repository.findAll();
    }
}
