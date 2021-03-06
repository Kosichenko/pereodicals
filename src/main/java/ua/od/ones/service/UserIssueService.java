package ua.od.ones.service;

import ua.od.ones.entity.UserIssue;

import java.util.List;
import java.util.Optional;

public interface UserIssueService extends GenericService<UserIssue>{

    @Override
    UserIssue create(UserIssue userIssue);

    @Override
    boolean update(UserIssue userIssue);

    @Override
    Optional<UserIssue> getById(long id);

    @Override
    List<UserIssue> getAll();
}
