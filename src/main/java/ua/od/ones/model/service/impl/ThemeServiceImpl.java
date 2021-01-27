package ua.od.ones.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.model.entity.Theme;
import ua.od.ones.model.repository.ThemeRepository;
import ua.od.ones.model.service.ThemeService;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeServiceImpl implements ThemeService {

    ThemeRepository repository;

    @Autowired
    public ThemeServiceImpl(ThemeRepository repository) {
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
    public Theme create(Theme theme) {
        if(theme.getId() == 0) {
            return repository.saveAndFlush(theme);
        }
        return theme;
    }

    @Override
    public boolean update(Theme theme) {
        if(theme.getId() == 0) {
            repository.saveAndFlush(theme);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Theme> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<Theme> getAll() {
        return repository.findAll();
    }
}
