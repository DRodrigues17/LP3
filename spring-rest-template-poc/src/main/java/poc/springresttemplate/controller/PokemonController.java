package poc.springresttemplate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poc.springresttemplate.model.Pokemon;
import poc.springresttemplate.service.PokemonIntegrationService;

import static org.springframework.util.StringUtils.capitalize;

@RestController
@RequestMapping("/api/v1/pokemons")
@CrossOrigin(origins = "*")
public class PokemonController {

    private PokemonIntegrationService pokemonIntegrationService;

    public PokemonController(PokemonIntegrationService pokemonIntegrationService) {
        this.pokemonIntegrationService = pokemonIntegrationService;
    }

    @GetMapping
    public ResponseEntity<String> findAll() {
        return ResponseEntity.ok("Hi! I'm RestTemplate POC!");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> findById(@PathVariable("id") int id) {
        Pokemon pokemon =this.pokemonIntegrationService.findById(id);
        pokemon.setName(capitalize(pokemon.getName()));

        return ResponseEntity.ok(pokemon);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Pokemon> findByName(@PathVariable("name") String name) {
        Pokemon pokemon =this.pokemonIntegrationService.findByName(name);
        pokemon.setName(capitalize(pokemon.getName()));

        return ResponseEntity.ok(pokemon);
    }

}
