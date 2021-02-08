package ua.od.ones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.ones.entity.Localization;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocalizationRepository extends JpaRepository <Localization, Long> {
    Optional<Localization> findById(Long id);

    Optional<Localization> findByName(String name);

    List<Localization> findAll();
}
