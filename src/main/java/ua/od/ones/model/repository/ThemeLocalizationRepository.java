package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.ones.model.entity.Theme;
import ua.od.ones.model.entity.ThemeLocalization;

import java.util.List;
import java.util.Optional;

@Repository
public interface ThemeLocalizationRepository extends JpaRepository <ThemeLocalization, Long> {
    Optional<ThemeLocalization> findById(Long id);

    List<ThemeLocalization> findAll();
}
