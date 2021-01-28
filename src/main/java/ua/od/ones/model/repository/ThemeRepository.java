package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.ones.model.entity.Theme;

import java.util.List;
import java.util.Optional;

@Repository
public interface ThemeRepository extends JpaRepository <Theme, Long> {
    Optional<Theme> findById(Long id);

    Optional<Theme> findByName(String name);

    List<Theme> findAll();
}
