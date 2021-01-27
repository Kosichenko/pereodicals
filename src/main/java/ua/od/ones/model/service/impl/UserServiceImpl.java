package ua.od.ones.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.model.entity.Role;
import ua.od.ones.model.entity.User;
import ua.od.ones.model.repository.RoleRepository;
import ua.od.ones.model.repository.UserRepository;
import ua.od.ones.model.service.RoleService;
import ua.od.ones.model.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
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
    public User create(User user) {
        if(user.getId() == 0) {
            return repository.saveAndFlush(user);
        }
        return user;
    }

    @Override
    public boolean update(User user) {
        if(user.getId() == 0) {
            repository.saveAndFlush(user);
            return true;
        }
        return false;
    }

    @Override
    public Optional<User> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }
}
