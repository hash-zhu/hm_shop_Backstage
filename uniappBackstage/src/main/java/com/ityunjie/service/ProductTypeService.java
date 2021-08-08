package com.ityunjie.service;

import com.ityunjie.dao.ProductTypeIDao;

import com.ityunjie.domain.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService {
    @Autowired
    private ProductTypeIDao productTypeIDao;

    public List<ProductType> getProductTypeAll(){
        return productTypeIDao.findAll();
    }
}
