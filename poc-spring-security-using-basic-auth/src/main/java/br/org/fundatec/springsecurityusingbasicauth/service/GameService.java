package br.org.fundatec.springsecurityusingbasicauth.service;

import br.org.fundatec.springsecurityusingbasicauth.enums.GameGenre;
import br.org.fundatec.springsecurityusingbasicauth.enums.GamePlataform;
import br.org.fundatec.springsecurityusingbasicauth.enums.GamePublisher;
import br.org.fundatec.springsecurityusingbasicauth.model.Game;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    private List<Game> games = new ArrayList<>(List.of(
            Game.builder()
                    .id(1L)
                    .title("The Legend of Zelda: Breath of the Wild")
                    .genre(GameGenre.ACTION_ADVENTURE)
                    .release(LocalDate.of(2017, Month.MARCH, 3))
                    .publisher(GamePublisher.NINTENDO)
                    .plataforms(List.of(GamePlataform.NINTENDO)).build(),

            Game.builder()
                    .id(2L)
                    .title("God of War")
                    .genre(GameGenre.ACTION_ADVENTURE)
                    .release(LocalDate.of(2018, Month.APRIL, 20))
                    .publisher(GamePublisher.SONY)
                    .plataforms(List.of(GamePlataform.PLAYSTATION, GamePlataform.PC)).build(),

            Game.builder()
                    .id(3L)
                    .title("Halo 5: Guardians")
                    .genre(GameGenre.SHOOTER)
                    .release(LocalDate.of(2015, Month.OCTOBER, 27))
                    .publisher(GamePublisher.MICROSOFT)
                    .plataforms(List.of(GamePlataform.XBOX)).build()));

    public List<Game> findAll(){
        return games;
    }

    public Game findById(long id){
        return findAll()
                .stream()
                .filter(game -> game.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.BAD_REQUEST, String.format("")
        ));
    }

    public Game findByTitle(String title ){
        return findAll()
                .stream()
                .filter(game -> game.getTitle().equals(title))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.BAD_REQUEST, String.format("")
                ));
    }
}
