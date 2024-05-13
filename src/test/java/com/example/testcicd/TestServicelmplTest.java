package com.example.testcicd;


import com.example.testcicd.service.TestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.PrimitiveIterator;

@SpringBootTest
@ActiveProfiles("dev")
public class TestServicelmplTest {

    @Autowired private TestService testService;

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @Test
    void checkProtSuccess(){
        Assertions.assertEquals(port,"3444");
    }

    @Test
    void checkPortFail(){
        Assertions.assertNotEquals(port,"8080");
    }

    @Test
    void getTestStringSuccess(){
        Assertions.assertEquals(testService.getTestString(),"okay develop server 3444");
    }

    @Test
    void getTestStringFail(){
        Assertions.assertNotEquals(testService.getTestString(),"okay develop server 8080");
    }

}
