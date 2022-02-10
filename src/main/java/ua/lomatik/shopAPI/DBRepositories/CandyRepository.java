package ua.lomatik.shopAPI.DBRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lomatik.shopAPI.DBEntities.Candy;

import java.util.Optional;

public interface CandyRepository extends JpaRepository<Candy, Long> {

    Optional<Candy> findCandyByBarCode(int bar_code);

}
