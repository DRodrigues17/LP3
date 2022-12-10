package poc.springresttemplate.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import poc.springresttemplate.model.Pokemon;

@Service
public class PokemonIntegrationService {

    private final RestTemplate restTemplate;

    @Value("${pokemon-external-api}")
    private String uri;

    public PokemonIntegrationService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Pokemon findById(int id) {
        String url = generateURLIntegrationById(id);
        return this.restTemplate.getForObject(url, Pokemon.class);
    }

    public Pokemon findByName(String name) {
        String url = generateURLIntegrationByName(name);
        return this.restTemplate.getForObject(url, Pokemon.class);
    }

    private String generateURLIntegrationById(int id) {
        return this.uri + "/" + id;
    }

    private String generateURLIntegrationByName(String name) {
        return this.uri + "/" + name;
    }

}
