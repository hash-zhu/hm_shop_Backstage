package com.ityunjie.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_goods_imgs")
public class GoodDetail {
    @Column(name = "goods_id")
    public Integer goodsId;
    @Id
    @Column(name = "img_url")
    public String imgUrl;

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

    @Override
    public String toString() {
        return "GoodDetail{" +
                "goodsId=" + goodsId +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
