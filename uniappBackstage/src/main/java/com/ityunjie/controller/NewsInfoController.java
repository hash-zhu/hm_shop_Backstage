package com.ityunjie.controller;

import com.ityunjie.domain.NewsInfo;
import com.ityunjie.service.NewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Printable;
import java.util.List;

@RestController
@RequestMapping(path = "/newsInfo")
public class NewsInfoController {

    @Autowired
    private NewsInfoService newsInfoService;
    @RequestMapping(path = "/getAll")
    public List<NewsInfo> getNewsInfoAll(){
        return newsInfoService.getNewsInfoAll();
    }
    @RequestMapping(path = "/getOneById")
    public NewsInfo getOneById(@RequestParam int id){
//        System.out.println("-----------------------------------------id="+id);
        return newsInfoService.getOneById(id);
    }
}
