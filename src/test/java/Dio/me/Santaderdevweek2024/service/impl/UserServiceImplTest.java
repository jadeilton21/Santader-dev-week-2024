package Dio.me.Santaderdevweek2024.service.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class UserServiceImplTest {


    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações forem invalidas...")
    void findById() throws Exception{


        var response = mockMvc
                .perform(post("/users"))
                .andReturn().getResponse();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }

    @Test
    @DisplayName("Deve Devolver Código Http 404 quando informações forem invalidas..")
    void create() throws Exception{



        var response = mockMvc.perform(
                post("/users")
        ).andReturn().getResponse();

        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }
}