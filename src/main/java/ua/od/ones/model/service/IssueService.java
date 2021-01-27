package ua.od.ones.model.service;

import ua.od.ones.model.entity.Issue;

import java.util.List;
import java.util.Optional;

public interface IssueService extends GenericService<Issue>{

    @Override
    Issue create(Issue issue);

    @Override
    boolean update(Issue issue);

    @Override
    Optional<Issue> getById(long id);

    @Override
    List<Issue> getAll();
}
