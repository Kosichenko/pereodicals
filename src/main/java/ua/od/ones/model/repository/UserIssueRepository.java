package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.ones.model.entity.UserIssue;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserIssueRepository extends JpaRepository <UserIssue, Long> {
    Optional<UserIssue> findById(Long id);

    List<UserIssue> findAll();
}
