package me.whiteship.demowebmvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void helloTest() throws Exception {
        mockMvc.perform(get("/hello")
                        .header(HttpHeaders.FROM, "localhost"))
                .andDo(print())
                .andExpect(status().isOk());

//        mockMvc.perform(get("/hello")
//                        .contentType(MediaType.APPLICATION_JSON_VALUE)
//                        .accept(MediaType.APPLICATION_JSON_VALUE))
//                .andDo(print())
//                .andExpect(status().isOk());

//        mockMvc.perform(get("/hello"))^
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().string("hello"));
//
//
//        mockMvc.perform(get("/hello"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().string("hello"));
//
//        mockMvc.perform(post("/hello"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().string("hello"));
//
//        mockMvc.perform(put("/hello"))
//                .andDo(print())
//                .andExpect(status().isMethodNotAllowed());
    }
}