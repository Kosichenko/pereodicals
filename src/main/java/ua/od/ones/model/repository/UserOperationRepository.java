package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.ones.model.entity.UserOperation;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserOperationRepository extends JpaRepository <UserOperation, Long> {
    Optional<UserOperation> findById(Long id);

    List<UserOperation> findAll();
}
