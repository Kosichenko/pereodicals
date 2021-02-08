package ua.od.ones.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.entity.Localization;
import ua.od.ones.repository.LocalizationRepository;
import ua.od.ones.service.LocalizationService;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class LocalizationServiceImpl implements LocalizationService {

    private LocalizationRepository repository;

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
    public Optional<Localization> getByLocalization(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Localization> getAll() {
        return repository.findAll();
    }
}
