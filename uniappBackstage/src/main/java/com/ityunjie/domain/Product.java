package com.ityunjie.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @Column(name = "product_id",unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @Column(name = "product_url")
    private String productUrl;
    @Column(name = "product_info")
    private String productInfo;

    @ManyToOne(targetEntity = ProductType.class,fetch =FetchType.LAZY )
    @JoinColumn(name = "product_productType_id",referencedColumnName = "id")
    // 防止json序列化死循环问题解决
    @JsonBackReference
    private ProductType productType;

    public Product(){}

    public Product(Integer productId, String productUrl, String productInfo) {
        this.productId = productId;
        this.productUrl = productUrl;
        this.productInfo = productInfo;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
