package ua.od.ones.service;

import ua.od.ones.entity.UserOperation;

import java.util.List;
import java.util.Optional;

public interface UserOperationService extends GenericService<UserOperation>{

    @Override
    UserOperation create(UserOperation userOperation);

    @Override
    boolean update(UserOperation userOperation);

    @Override
    Optional<UserOperation> getById(long id);

    @Override
    List<UserOperation> getAll();
}
