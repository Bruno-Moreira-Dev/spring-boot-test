package br.com.bruno.spring_boot_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class IntIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testIntegration() throws Exception {
        RequestBuilder requestBuilder = get("/test");
        MvcResult resultado = mvc.perform(requestBuilder).andReturn();
        Assertions.assertEquals("Bem-vindo, Bruno", resultado.getResponse().getContentAsString());
    }

    @Test
    public void testIntegrationWithArgument() throws Exception {
        mvc.perform(get("/test?nome=Bruno"))
                .andExpect(content().string("Bem-vindo, Bruno"));
    }
}
