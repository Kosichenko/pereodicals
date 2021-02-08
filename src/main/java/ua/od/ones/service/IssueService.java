package ua.od.ones.service;

import ua.od.ones.entity.Issue;

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
