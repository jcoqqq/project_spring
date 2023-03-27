package com.example.project_spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import service.WebService;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class WebServiceTest {

    @Test
    void shouldCreerPersonne() throws JsonProcessingException {
        assertThat(WebService.getPersonnes().size()).isEqualTo(2);
    }

    @Test
    void shouldTrue() {
        assertThat(true).isEqualTo(true);
    }
}
