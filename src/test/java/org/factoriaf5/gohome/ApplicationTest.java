package org.factoriaf5.gohome;

import org.factoriaf5.gohome.repositories.GoHome;
import org.factoriaf5.gohome.repositories.GoHomeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTests {
    @BeforeEach
    void setUp() {
        goHomeRepository.deleteAll();
    }

    @Autowired
    MockMvc mockMvc;

    @Test
    void loadsTheHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
    }
    @Autowired
    GoHomeRepository goHomeRepository;


    @Test
    void returnsTheExistingHomes() throws Exception {

        GoHome goHome = goHomeRepository.save(new GoHome("Napoles", "http://2.bp.blogspot.com/-CPACB1sSmGs/Unvq3fKG4uI/AAAAAAAAHd8/iJoo2HB7dG4/s1600/fachada-de-casa-moderna-de-ladrillo-visto-de-2-pisos.jpg", "700", "670m2", "", "5"));

        mockMvc.perform(get("/homes"))
                .andExpect(status().isOk())
                .andExpect(view().name("homes/all"))
                .andExpect(model().attribute("homes", hasItem(goHome)));
    }
}
