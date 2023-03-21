package service;

import domain.Personne;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class WebService {

    public void genererFichier(String nomDossier) {




    }

    public void creerWord(String nomDossier, Document document) throws IOException {
        String url = "C:/Users/jcoqu/java/" + nomDossier + ".docx";
        File file = new File(url);

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        document.write(fileOutputStream);
        fileOutputStream.close();
    }

    public List<Personne> getPersonnes() {
        List<Personne> personneList = new ArrayList<>();

        personneList.add(new Personne("Nom", "Prenom", LocalDate.parse("17-04-2000")));
        personneList.add(new Personne("Prenom", "Nom", LocalDate.parse("17-04-2010")));

        return personneList;
    }
}
