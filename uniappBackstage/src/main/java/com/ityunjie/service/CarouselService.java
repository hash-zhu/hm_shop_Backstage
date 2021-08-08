package com.ityunjie.service;

import com.ityunjie.dao.CarouselDao;
import com.ityunjie.domain.Carousel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarouselService {
    @Autowired
    private CarouselDao carouselDao;
    public List<Carousel> getAll(){
        return carouselDao.findAll();
    }
    public Carousel findByCarouseId(Integer id){
        return carouselDao.findByCarouselId(id);
    }
}
