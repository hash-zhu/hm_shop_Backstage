package com.ityunjie.service;

import com.ityunjie.dao.NewsInfoIDao;
import com.ityunjie.domain.NewsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsInfoService {
    @Autowired
    private NewsInfoIDao newsInfoIDao;

    public List<NewsInfo> getNewsInfoAll(){
        return newsInfoIDao.findAll();
    }
    public NewsInfo getOneById(int id){
        return newsInfoIDao.findById(id);
    };
}
