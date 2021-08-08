package com.ityunjie.dao;

import com.ityunjie.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;


/**
 * JpaRepository<实体类类型，主键类型>：用来完成基本CRUD操作
 * JpaSpecificationExecutor<实体类类型>：用于复杂查询（分页等查询操作）
 */

public interface GoodsIDao extends JpaRepository<Goods,Integer>, JpaSpecificationExecutor<Goods> {
    public List<Goods> findAll();
    public Goods findByGoodsId(Integer goodsId);
}
