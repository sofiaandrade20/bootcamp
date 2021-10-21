package bootcamp.repository;

import bootcamp.model.SuperPower;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public interface SuperPowerRepository extends JpaRepository<SuperPower,Long> {
}
