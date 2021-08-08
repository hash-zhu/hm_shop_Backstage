package com.ityunjie.dao;

import com.ityunjie.domain.GoodDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsDetailIDao extends JpaRepository<GoodDetail,String> {
    public List<GoodDetail> findByGoodsId(Integer goodsId);
}
