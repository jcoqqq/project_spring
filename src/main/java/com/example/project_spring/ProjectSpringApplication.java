package com.example.project_spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import service.WebService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ProjectSpringApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProjectSpringApplication.class, args);

        WebService.genererFichier("nomDossier");


    }


}
