package com.ityunjie.dao;

import com.ityunjie.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductIDao extends JpaRepository<Product,Integer>, JpaSpecificationExecutor<Product> {
}
