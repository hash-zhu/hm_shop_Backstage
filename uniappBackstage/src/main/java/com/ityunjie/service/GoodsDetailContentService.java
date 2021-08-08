package com.ityunjie.service;

import com.ityunjie.dao.GoodsDetailContentIDao;
import com.ityunjie.domain.GoodsDetailContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsDetailContentService {
    @Autowired
    private GoodsDetailContentIDao contentIDao;

    public List<GoodsDetailContent> findGoodsById(Integer goodsId){
        return contentIDao.findByGoodsId(goodsId);
    }
}
