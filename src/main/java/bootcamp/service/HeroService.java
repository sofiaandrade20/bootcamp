package bootcamp.service;

import bootcamp.model.Hero;
import bootcamp.repository.HeroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    //Get all heroes
    public List<Hero> findAll() {
        return heroRepository.findAll();
    }
}
