package bootcamp.controller;

import bootcamp.model.SuperPower;
import bootcamp.service.SuperPowerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SuperPowerController {
    private final SuperPowerService superPowerService;

    public SuperPowerController(SuperPowerService superPowerService) {
        this.superPowerService = superPowerService;
    }

    //Get all superpowers
    @GetMapping("/get-superpowers")
    public List<SuperPower> getSuperpowers() {
        return superPowerService.findAll();
    }
}
