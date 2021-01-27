package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.od.ones.model.entity.UserIssue;

import java.util.List;
import java.util.Optional;

public interface UserIssueRepository extends JpaRepository <UserIssue, Long> {
    Optional<UserIssue> findById(Long id);

    Optional<UserIssue> findByName(String name);

    List<UserIssue> findAll();
}
