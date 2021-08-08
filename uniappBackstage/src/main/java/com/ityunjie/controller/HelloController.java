package com.ityunjie.controller;

import com.ityunjie.dao.CarouselDao;
import com.ityunjie.domain.Carousel;
import com.ityunjie.domain.Goods;
import com.ityunjie.service.CarouselService;
import com.ityunjie.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private CarouselService carouselDao;
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello World";
    }

    @RequestMapping("/")
    public List<Carousel> getAll() {
        return carouselDao.getAll();
    }

    @RequestMapping("/getOneById/{Id}")
    public Carousel getOneById(@PathVariable("Id")Integer id){
        return carouselDao.findByCarouseId(id);
    }

    @RequestMapping("/goodsList")
    public List<Goods> getGoods() {
        return goodsService.findPage(0);

    }

    @RequestMapping(path = "/goodsAll")
    public List<Goods> goodsAll() {
        return goodsService.goodsAll();
    }

    @RequestMapping("/goodsPageList")
    public List<Goods> goodsPageList(@RequestParam("page") Integer page) {
        return goodsService.findPage(page);
    }
    @RequestMapping("/findByGoodsId/{id}")
    public Goods findByGoodsId(@PathVariable("id")Integer goodsId){
    return goodsService.findByGoodsId(goodsId);
    }
}
