package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import domain.Personne;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class WebService {

    public static void genererFichier(String nomDossier) {


        XWPFDocument document = new XWPFDocument();


        try {
            creerWord(nomDossier, document);

        } catch (Exception e) {
            System.out.println("marche po");
            System.out.println(e);

        }


    }

    public static void creerWord(String nomDossier, XWPFDocument document) throws IOException {
        String url = "C:/Word/" + nomDossier + ".docx";
        File file = new File(url);

        XWPFParagraph paragraph = document.createParagraph();

        XWPFRun run = paragraph.createRun();

        List<Personne> list = getPersonnes();


        run.setText(getPersonnes().toString());

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        document.write(fileOutputStream);
        fileOutputStream.close();
        document.close();
    }

    public static List<Personne> getPersonnes() throws JsonProcessingException {
        List<Personne> personneList = new ArrayList<>();

        personneList.add(new Personne("Nom", "Prenom"));
        personneList.add(new Personne("Prenom", "Nom"));


        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        ObjectWriter objectWriter = mapper.writer().withDefaultPrettyPrinter();
        objectWriter.writeValueAsString(personneList.get(0));

        return personneList;
    }
}
