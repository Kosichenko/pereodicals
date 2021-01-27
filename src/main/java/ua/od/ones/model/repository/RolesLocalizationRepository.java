package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.od.ones.model.entity.RolesLocalization;

import java.util.List;
import java.util.Optional;

public interface RolesLocalizationRepository extends JpaRepository <RolesLocalization, Long> {
    Optional<RolesLocalization> findById(Long id);

    Optional<RolesLocalization> findByName(String name);

    List<RolesLocalization> findAll();
}
