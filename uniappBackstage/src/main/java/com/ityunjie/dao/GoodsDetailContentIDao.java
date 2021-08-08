package com.ityunjie.dao;

import com.ityunjie.domain.GoodsDetailContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsDetailContentIDao extends JpaRepository<GoodsDetailContent,Integer> {
    public List<GoodsDetailContent> findByGoodsId(Integer goodsId);
}
