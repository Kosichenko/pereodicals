package ua.od.ones.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.ones.model.entity.Issue;
import ua.od.ones.model.entity.Theme;
import ua.od.ones.model.repository.IssueRepository;
import ua.od.ones.model.repository.ThemeRepository;
import ua.od.ones.model.service.IssueService;

import java.util.List;
import java.util.Optional;

@Service
public class IssueServiceImpl implements IssueService {

    IssueRepository repository;

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
}
