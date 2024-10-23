package cafe.data.db;

import cafe.entity.CoffeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeDbRepository extends JpaRepository<CoffeeEntity, Long> {

}