package com.ityunjie.domain;

import javax.persistence.*;
@Entity
@Table(name = "t_goods_list")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id")
    private Integer goodsId;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "goods_info")
    private String goodsInfo;
    @Column(name = "presend_price")
    private Integer presendPrice;
    @Column(name = "original_price")
    private Integer originalPrice;

    public Goods() {
    }

    public Goods(Integer goodsId, String imgUrl, String goodsInfo, Integer presendPrice) {
        this.goodsId = goodsId;
        this.imgUrl = imgUrl;
        this.goodsInfo = goodsInfo;
        this.presendPrice = presendPrice;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public Integer getPresendPrice() {
        return presendPrice;
    }

    public void setPresendPrice(Integer presendPrice) {
        this.presendPrice = presendPrice;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", imgUrl='" + imgUrl + '\'' +
                ", goodsInfo='" + goodsInfo + '\'' +
                ", presendPrice=" + presendPrice +
                ", originalPrice=" + originalPrice +
                '}';
    }
}
