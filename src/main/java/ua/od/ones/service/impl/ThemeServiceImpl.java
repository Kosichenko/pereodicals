package ua.od.ones.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.entity.Theme;
import ua.od.ones.repository.ThemeRepository;
import ua.od.ones.service.ThemeService;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class ThemeServiceImpl implements ThemeService {

    private ThemeRepository repository;

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
    public Optional<Theme> getByTheme(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Theme> getAll() {
        return repository.findAll();
    }
}
