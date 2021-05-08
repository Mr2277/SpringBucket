package com.child.sale.controller;

import com.child.sale.SaleApplication;
import com.child.sale.service.SaleService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@AutoConfigureMockMvc  //测试接口用

@SpringBootTest(classes = SaleApplication.class)
class SaleControllerTest {




    @Autowired
    private MockMvc mockMvc;


    @Test
    void selectOne() {
    }

    @Test
    void selectByPage() {
    }

    @Test
    void selectByLimit() {
    }





    @Test
    void inser() throws Exception {
        String json="{\n" +
                "  \"name\": \"demoData\",\n" +
                "  \"id\": \"demoData\"\n" +
                "}";
        mockMvc.perform(
                MockMvcRequestBuilders.post("/sale/user")
                                      .content(json) //传json参数
                                      .contentType(MediaType.APPLICATION_JSON)
                //.session(session)
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}