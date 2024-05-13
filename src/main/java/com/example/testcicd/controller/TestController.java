package com.example.testcicd.controller;

import com.example.testcicd.TestCicdApplication;
import com.example.testcicd.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    @GetMapping
    public String test(){
        return testService.getTestString();
    }
}
