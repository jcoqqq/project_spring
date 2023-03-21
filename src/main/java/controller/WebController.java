package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.WebService;

@RestController
public class WebController {

    @Autowired
    WebService webService;

    @PostMapping("/dossier")
    public void genererFichier(@RequestParam String nomDossier) {
        webService.genererFichier(nomDossier);
    }
}
