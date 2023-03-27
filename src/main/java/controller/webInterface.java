package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.WebService;

@RequestMapping(value = "/v1")
public interface webInterface {

    @PostMapping("/dossier")
    ResponseEntity<Boolean> genererFichier(@RequestParam String nomDossier);

}
