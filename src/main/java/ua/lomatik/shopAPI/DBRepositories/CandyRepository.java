package ua.lomatik.shopAPI.DBRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lomatik.shopAPI.DBEntities.Candy;

public interface CandyRepository extends JpaRepository<Candy, Long> {
}
