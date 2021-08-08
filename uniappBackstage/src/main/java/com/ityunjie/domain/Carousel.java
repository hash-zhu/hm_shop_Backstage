package com.ityunjie.domain;

import javax.persistence.*;

/*
    使用JPA注解配置映射关系
    @Entity 告诉jpa这是一个实体类（和数据库表映射的类）
    @Table 指定和哪个数据表对应；如果省略name,默认表名是user
 */
@Entity
@Table(name = "t_carousel")
public class Carousel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成策略
    @Column(name = "carousel_id")//数据库字段名
    private Integer carouselId;

    @Column(name = "carousel_url")
    private String carouselUrl;

    public Carousel(String carouselUrl) {
        this.carouselUrl = carouselUrl;
    }

    public Carousel() {
    }

    public Integer getCarouselId() {
        return carouselId;
    }

    public void setCarouselId(Integer carouselId) {
        this.carouselId = carouselId;
    }

    public String getCarouselUrl() {
        return carouselUrl;
    }

    public void setCarouselUrl(String carouselUrl) {
        this.carouselUrl = carouselUrl;
    }
}
