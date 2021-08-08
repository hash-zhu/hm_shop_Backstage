package com.ityunjie.service;

import com.ityunjie.dao.GoodsDetailIDao;
import com.ityunjie.dao.GoodsIDao;
import com.ityunjie.domain.GoodDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsDetailService {
    @Autowired
    private GoodsDetailIDao goodsDetailIDao;

    public List<GoodDetail> findByGoodsId(Integer goodsId) {
        return goodsDetailIDao.findByGoodsId(goodsId);
    }
}
