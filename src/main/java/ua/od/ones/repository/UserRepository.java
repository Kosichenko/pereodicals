package ua.od.ones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.ones.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);

    Optional<User> findByName(String name);

    List<User> findAll();
}
