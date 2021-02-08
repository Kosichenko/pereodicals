package ua.od.ones.service.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.entity.Issue;
import ua.od.ones.repository.IssueRepository;
import ua.od.ones.service.IssueService;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class IssueServiceImpl implements IssueService {

    private IssueRepository repository;

    @Autowired
    public IssueServiceImpl(IssueRepository repository) {
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
    public Issue create(Issue issue) {
        if(issue.getId() == 0) {
            return repository.saveAndFlush(issue);
        }
        return issue;
    }

    @Override
    public boolean update(Issue issue) {
        if(issue.getId() == 0) {
            repository.saveAndFlush(issue);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Issue> getById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<Issue> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Issue> getByIssue(String name) {
        return repository.findByName(name);
    }
}
