package ua.od.ones.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.model.entity.User;
import ua.od.ones.model.entity.UserIssue;
import ua.od.ones.model.repository.UserIssueRepository;
import ua.od.ones.model.repository.UserRepository;
import ua.od.ones.model.service.UserIssueService;
import ua.od.ones.model.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserIssueServiceImpl implements UserIssueService {

    UserIssueRepository repository;

    @Autowired
    public UserIssueServiceImpl(UserIssueRepository repository) {
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
    public UserIssue create(UserIssue userIssue) {
        if(userIssue.getId() == 0) {
            return repository.saveAndFlush(userIssue);
        }
        return userIssue;
    }

    @Override
    public boolean update(UserIssue userIssue) {
        if(userIssue.getId() == 0) {
            repository.saveAndFlush(userIssue);
            return true;
        }
        return false;
    }

    @Override
    public Optional<UserIssue> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<UserIssue> getAll() {
        return repository.findAll();
    }
}
