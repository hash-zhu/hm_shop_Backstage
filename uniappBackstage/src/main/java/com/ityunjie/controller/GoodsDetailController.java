package com.ityunjie.controller;

import com.ityunjie.domain.GoodDetail;
import com.ityunjie.service.GoodsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsDetailController {
    @Autowired
    public GoodsDetailService goodsDetailService;
    @RequestMapping(path = "/getGoodsDetail/{id}")
    public List<GoodDetail> getGoodsDetail(@PathVariable(name = "id") Integer goodsId){
        return goodsDetailService.findByGoodsId(goodsId);
    }
}
