package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.od.ones.model.entity.User;
import ua.od.ones.model.entity.UserOperation;

import java.util.List;
import java.util.Optional;

public interface UserOperationRepository extends JpaRepository <UserOperation, Long> {
    Optional<UserOperation> findById(Long id);

    Optional<UserOperation> findByName(String name);

    List<UserOperation> findAll();
}
