package controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.WebService;

@RestController
@Slf4j
@AllArgsConstructor
public class WebController implements webInterface {


    private WebService webService;

    @Override
    public ResponseEntity<Boolean> genererFichier(String nomDossier) {
        System.out.println("AppelFct");
        WebService.genererFichier(nomDossier);
        System.out.println("retourFct");
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
