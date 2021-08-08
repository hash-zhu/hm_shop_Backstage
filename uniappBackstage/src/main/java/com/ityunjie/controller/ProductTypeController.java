package com.ityunjie.controller;

import com.ityunjie.domain.ProductType;
import com.ityunjie.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/productType")
public class ProductTypeController {

    @Autowired
    public ProductTypeService typeService;

    @RequestMapping(path = "/getAll")
    public List<ProductType> getProductTypeAll(){

        List<ProductType> productTypes = typeService.getProductTypeAll();
        for (ProductType type:productTypes) {
            System.out.println("-------------------------------------------");
            System.out.println(type);
        }
        return productTypes;
    }
}
