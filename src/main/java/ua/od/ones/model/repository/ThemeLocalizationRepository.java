package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.od.ones.model.entity.Theme;
import ua.od.ones.model.entity.ThemeLocalization;

import java.util.List;
import java.util.Optional;

public interface ThemeLocalizationRepository extends JpaRepository <ThemeLocalization, Long> {
    Optional<ThemeLocalization> findById(Long id);

    Optional<ThemeLocalization> findByName(String name);

    List<ThemeLocalization> findAll();
}
