package it.musialmarek.tacocloud.web.home;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;


@WebMvcTest
class HomeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldOpenViewWithNameHomeWithWelcomingInside() throws Exception {
        //when
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(
                        containsString("Witaj w...")));
    }
}