package com.ityunjie.domain;

import javax.persistence.*;

/*
* create table tb_news_data
(
    img_Url      text null,
    title        text null,
    year         text null,
    score        text null,
    number_views text null,
    id           int auto_increment
        primary key
);
* */
@Entity
@Table(name = "tb_news_data")
public class NewsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "title")
    private String title;
    @Column(name = "year")
    private String year;
    @Column(name = "score")
    private String score;
    @Column(name = "number_views")
    private String numberViews;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getNumberViews() {
        return numberViews;
    }

    public void setNumberViews(String numberViews) {
        this.numberViews = numberViews;
    }

    @Override
    public String toString() {
        return "NewsInfo{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", score='" + score + '\'' +
                ", numberViews='" + numberViews + '\'' +
                '}';
    }
}
