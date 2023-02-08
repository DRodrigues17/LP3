package br.org.fundatec.springsecurityusingbasicauth.controller;

import br.org.fundatec.springsecurityusingbasicauth.model.Game;
import br.org.fundatec.springsecurityusingbasicauth.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {
    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Game>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/{title}")
    public ResponseEntity<Game> findByTitle(@PathVariable String title){
        return ResponseEntity.ok(service.findByTitle(title));
    }
}
