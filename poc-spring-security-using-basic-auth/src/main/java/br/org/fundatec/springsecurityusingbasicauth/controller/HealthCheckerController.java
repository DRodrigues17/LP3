package br.org.fundatec.springsecurityusingbasicauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/health")
public class HealthCheckerController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("a poc está funcionando");
    }
}
