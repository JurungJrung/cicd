package com.example.testcicd.controller;

import com.example.testcicd.TestCicdApplication;
import com.example.testcicd.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // final을 붙인 레이어에 자동으로 의존성 주입.
public class TestController {

    private final TestService testService;


    @GetMapping("/test")
    public String getTestString() {
        return testService.getTestString();
    }

}
