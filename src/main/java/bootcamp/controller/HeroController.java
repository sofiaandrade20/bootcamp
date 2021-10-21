package bootcamp.controller;

import bootcamp.model.Hero;
import bootcamp.service.HeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeroController {
    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    //Get all heroes
    @GetMapping("/get-heroes")
    public List<Hero> getHeroes() {
        return heroService.findAll();
    }
}
