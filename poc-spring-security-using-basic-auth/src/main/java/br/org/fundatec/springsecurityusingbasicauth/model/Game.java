package br.org.fundatec.springsecurityusingbasicauth.model;

import br.org.fundatec.springsecurityusingbasicauth.enums.GameGenre;
import br.org.fundatec.springsecurityusingbasicauth.enums.GamePlataform;
import br.org.fundatec.springsecurityusingbasicauth.enums.GamePublisher;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Game {
    private Long id;
    private String title;
    private GameGenre genre;
    private LocalDate release;
    private GamePublisher publisher;
    private List<GamePlataform> plataforms;
}
