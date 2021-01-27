package ua.od.ones.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.model.entity.Localization;
import ua.od.ones.model.repository.LocalizationRepository;
import ua.od.ones.model.service.LocalizationService;

import java.util.List;
import java.util.Optional;

@Service
public class LocalizationServiceImpl implements LocalizationService {

    LocalizationRepository repository;

    @Autowired
    public LocalizationServiceImpl(LocalizationRepository repository) {
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
    public Localization create(Localization localization) {
        if(localization.getId() == 0) {
            return repository.saveAndFlush(localization);
        }
        return localization;
    }

    @Override
    public boolean update(Localization localization) {
        if(localization.getId() == 0) {
            repository.saveAndFlush(localization);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Localization> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<Localization> getAll() {
        return repository.findAll();
    }
}
