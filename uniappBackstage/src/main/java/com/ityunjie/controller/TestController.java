package com.ityunjie.controller;

import com.ityunjie.domain.Test;
import com.ityunjie.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "/test",method = {RequestMethod.GET,RequestMethod.POST})
    public List<Test> getTests(){
        return testService.getFindPage();

    }
}
