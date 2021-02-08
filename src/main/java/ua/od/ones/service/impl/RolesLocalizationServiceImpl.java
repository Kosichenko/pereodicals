package ua.od.ones.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.entity.RolesLocalization;
import ua.od.ones.repository.RolesLocalizationRepository;
import ua.od.ones.service.RolesLocalizationService;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class RolesLocalizationServiceImpl implements RolesLocalizationService {

    private RolesLocalizationRepository repository;

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
