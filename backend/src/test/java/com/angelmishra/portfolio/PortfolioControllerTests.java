package com.angelmishra.portfolio;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Map;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PortfolioControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testGetPortfolioAllData() throws Exception {
        mockMvc.perform(get("/api/v1/portfolio"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.success", is(true)))
            .andExpect(jsonPath("$.data.profile.name", is("Angel Mishra")))
            .andExpect(jsonPath("$.data.projects", hasSize(6)))
            .andExpect(jsonPath("$.data.achievements", hasSize(6)))
            .andExpect(jsonPath("$.data.skills", hasSize(5)));
    }

    @Test
    void testGetHealthEndpoint() throws Exception {
        mockMvc.perform(get("/api/v1/health"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.success", is(true)))
            .andExpect(jsonPath("$.data.status", is("UP")));
    }

    @Test
    void testSubmitContactMessageSuccess() throws Exception {
        Map<String, String> validRequest = Map.of(
            "name", "Recruiter",
            "email", "recruiter@example.com",
            "subject", "Software Engineering Opportunity",
            "message", "Hello Angel, we reviewed your portfolio and would like to connect."
        );

        mockMvc.perform(post("/api/v1/contact")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(validRequest)))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.success", is(true)))
            .andExpect(jsonPath("$.data.name", is("Recruiter")))
            .andExpect(jsonPath("$.data.email", is("recruiter@example.com")));
    }

    @Test
    void testSubmitContactMessageValidationError() throws Exception {
        Map<String, String> invalidRequest = Map.of(
            "name", "",
            "email", "not-an-email",
            "message", "hi"
        );

        mockMvc.perform(post("/api/v1/contact")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(invalidRequest)))
            .andExpect(status().isBadRequest())
            .andExpect(jsonPath("$.success", is(false)));
    }
}
