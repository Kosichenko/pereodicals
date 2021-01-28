package ua.od.ones.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.ones.model.entity.RolesLocalization;

import java.util.List;
import java.util.Optional;

@Repository
public interface RolesLocalizationRepository extends JpaRepository <RolesLocalization, Long> {
    Optional<RolesLocalization> findById(Long id);

    List<RolesLocalization> findAll();
}
