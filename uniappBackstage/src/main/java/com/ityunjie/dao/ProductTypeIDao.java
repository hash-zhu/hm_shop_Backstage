package com.ityunjie.dao;

import com.ityunjie.domain.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductTypeIDao extends JpaRepository<ProductType,Integer>, JpaSpecificationExecutor<ProductType> {
    @Query(value = "select * from product_type ",nativeQuery = true)
    public List<ProductType> getProductTypeAll();
}
