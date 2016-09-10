package net.charno.web.controllers;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * Created by charno on 9/10/16.
 */
public class DbpediaControllerTest {

    @Test
    public void testLookupTerm() throws Exception {
        DbpediaController controller = new DbpediaController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/dbpedia/lookup/term"))
                .andExpect(MockMvcResultMatchers.view().name("dbpedia-term"));
    }
}