package com.ityunjie.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//社区图片left
@Entity
@Table(name = "product_type")
public class ProductType {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "productType",cascade = CascadeType.ALL)
    private List<Product> products;

    public ProductType() {
    }

    public ProductType(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

//    @Override
//    public String toString() {
//        return "ProductType{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", products=" + products +
//                '}';
//    }
}
