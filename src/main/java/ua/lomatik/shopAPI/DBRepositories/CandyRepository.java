package ua.lomatik.shopAPI.DBRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lomatik.shopAPI.DBEntities.CandyEntity;

import java.util.Optional;

public interface CandyRepository extends JpaRepository<CandyEntity, Long> {

    Optional<CandyEntity> findCandyByBarCode(int bar_code);

}
