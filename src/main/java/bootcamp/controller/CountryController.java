package bootcamp.controller;

import bootcamp.model.Country;
import bootcamp.request.CountryRequest;
import bootcamp.request.UpdateNameRQ;
import bootcamp.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;

@RestController
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    //Get all countries
    @GetMapping("/get-Countries")
    public List<Country> getCountries() {
        return countryService.findAll();
    }

    //Get country by id
    @GetMapping("/get-CountriesById/{id}")
    public Country getCountryById(@PathVariable(value = "id") Long id) {
        return countryService.findById(id);
    }

    //Create country
    @PostMapping(value = "/create-Countries")
    public Country createCountry(@RequestBody CountryRequest newCountry) {
        return countryService.addCountry(newCountry);
    }

    //Update country
    @PutMapping("/country/{id}/name")
    public ResponseEntity updateName(@PathVariable Long id, @RequestBody UpdateNameRQ request) {
        final Country updatedCountry = countryService.updateCountry(id, request.getName());
        return ResponseEntity.created(URI.create("/country/" + id + "/name")).body("Name updated");
    }

    //Delete country
    @DeleteMapping(value = "/delete-Countries/{id}")
    public void deleteCountry(@PathVariable(value = "id") Long id) {
        countryService.deleteById(id);
    }
}
