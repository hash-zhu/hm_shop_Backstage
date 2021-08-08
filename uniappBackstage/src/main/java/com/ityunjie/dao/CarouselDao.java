package com.ityunjie.dao;
import com.ityunjie.domain.Carousel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


//继承JpaRepository来完成对数据库的操作

public interface CarouselDao extends JpaRepository<Carousel,Integer> {
    //方法名称必须要遵循驼峰式命名规则，findBy（关键字）+属性名称（首字母大写）+查询条件（首字母大写）
    public Carousel findByCarouselId(Integer carousel_id);
    public List<Carousel> findAll();

}
