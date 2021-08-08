package com.ityunjie.controller;

import com.ityunjie.domain.GoodsDetailContent;
import com.ityunjie.service.GoodsDetailContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsDetailContentController {
    @Autowired
    private GoodsDetailContentService contentService;
    @RequestMapping(path = "/getContent/{id}")
    public List<GoodsDetailContent> getContent(@PathVariable(name = "id")Integer goodsId){
        return contentService.findGoodsById(goodsId);
    }
}
