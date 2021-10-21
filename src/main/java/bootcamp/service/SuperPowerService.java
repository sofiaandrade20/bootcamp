package bootcamp.service;

import bootcamp.model.SuperPower;
import bootcamp.repository.SuperPowerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperPowerService {
    private final SuperPowerRepository superPowerRepository;

    public SuperPowerService(SuperPowerRepository superPowerRepository) {
        this.superPowerRepository = superPowerRepository;
    }

    //Get all superpowers
    public List<SuperPower> findAll() {
        return superPowerRepository.findAll();
    }

}
