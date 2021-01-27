package ua.od.ones.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.model.entity.Role;
import ua.od.ones.model.entity.RolesLocalization;
import ua.od.ones.model.repository.RoleRepository;
import ua.od.ones.model.repository.RolesLocalizationRepository;
import ua.od.ones.model.service.RoleService;
import ua.od.ones.model.service.RolesLocalizationService;

import java.util.List;
import java.util.Optional;

@Service
public class RolesLocalizationServiceImpl implements RolesLocalizationService {

    RolesLocalizationRepository repository;

    @Autowired
    public RolesLocalizationServiceImpl(RolesLocalizationRepository repository) {
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
    public RolesLocalization create(RolesLocalization rolesLocalization) {
        if(rolesLocalization.getId() == 0) {
            return repository.saveAndFlush(rolesLocalization);
        }
        return rolesLocalization;
    }

    @Override
    public boolean update(RolesLocalization rolesLocalization) {
        if(rolesLocalization.getId() == 0) {
            repository.saveAndFlush(rolesLocalization);
            return true;
        }
        return false;
    }

    @Override
    public Optional<RolesLocalization> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<RolesLocalization> getAll() {
        return repository.findAll();
    }
}
