package com.ityunjie.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class GoodsDetailContent {
    @Id
    @Column(name = "goods_id")
    private Integer goodsId;
    @Column(name = "content_string")
    private String contentString;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getContentString() {
        return contentString;
    }

    public void setContentString(String contentString) {
        this.contentString = contentString;
    }

    @Override
    public String toString() {
        return "GoodsDetailContent{" +
                "goodsId=" + goodsId +
                ", contentString='" + contentString + '\'' +
                '}';
    }
}
