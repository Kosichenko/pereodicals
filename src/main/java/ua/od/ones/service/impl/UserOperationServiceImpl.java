package ua.od.ones.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.entity.UserOperation;
import ua.od.ones.repository.UserOperationRepository;
import ua.od.ones.service.UserOperationService;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class UserOperationServiceImpl implements UserOperationService {

    private UserOperationRepository repository;

    @Autowired
    public UserOperationServiceImpl(UserOperationRepository repository) {
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
    public UserOperation create(UserOperation userOperation) {
        if(userOperation.getId() == 0) {
            return repository.saveAndFlush(userOperation);
        }
        return userOperation;
    }

    @Override
    public boolean update(UserOperation userOperation) {
        if(userOperation.getId() == 0) {
            repository.saveAndFlush(userOperation);
            return true;
        }
        return false;
    }

    @Override
    public Optional<UserOperation> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<UserOperation> getAll() {
        return repository.findAll();
    }
}
