package com.ityunjie.dao;

import com.ityunjie.domain.NewsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsInfoIDao extends JpaRepository<NewsInfo,Integer> {

    public NewsInfo findById(int id);
}
