package bootcamp.repository;

import bootcamp.model.Hero;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public interface HeroRepository extends JpaRepository<Hero,Long> {
}
