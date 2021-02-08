package ua.od.ones.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.entity.ThemeLocalization;
import ua.od.ones.repository.ThemeLocalizationRepository;
import ua.od.ones.service.ThemeLocalizationService;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class ThemeLocalizationServiceImpl implements ThemeLocalizationService {

    private ThemeLocalizationRepository repository;

    @Autowired
    public ThemeLocalizationServiceImpl(ThemeLocalizationRepository repository) {
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
    public ThemeLocalization create(ThemeLocalization themeLocalization) {
        if(themeLocalization.getId() == 0) {
            return repository.saveAndFlush(themeLocalization);
        }
        return themeLocalization;
    }

    @Override
    public boolean update(ThemeLocalization themeLocalization) {
        if(themeLocalization.getId() == 0) {
            repository.saveAndFlush(themeLocalization);
            return true;
        }
        return false;
    }

    @Override
    public Optional<ThemeLocalization> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<ThemeLocalization> getAll() {
        return repository.findAll();
    }
}
