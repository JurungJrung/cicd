package com.example.testcicd.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class TestServicelmpl implements TestService {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String apllicationName;

    public String getTestString(){
        return "okay"+" "+apllicationName+" "+port;
    }
}
