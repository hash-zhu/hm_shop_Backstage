package com.ityunjie.service;

import com.ityunjie.dao.TestIDao;
import com.ityunjie.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestIDao testIDao;

    public List<Test> getFindPage(){
        /**
         * 1.构造分页参数
         * 		Pageable : 接口
         * 			PageRequest实现了Pageable接口，调用构造方法的形式构造
         * 				第一个参数：页码（从0开始）
         * 				第二个参数：每页查询条数
         */
        Pageable pageable = PageRequest.of(0, 3);

        /**
         * 分页查询，封装为Spring Data Jpa 内部的page bean
         * 		此重载的findAll方法为分页方法需要两个参数
         * 			第一个参数：查询条件Specification
         * 			第二个参数：分页参数
         */

        //2.构造查询条件
        Specification<Test>  specification = new Specification<Test>() {
            @Override
            public Predicate toPredicate(Root<Test> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                return criteriaBuilder.like(root.get("callIndex"),"%o%");
            }
        };
        Page<Test> pages = testIDao.findAll(specification, pageable);
/**
 *  //获取总页数
 * 	int getTotalPages();
 * 	 //获取总记录数
 * long getTotalElements();
 * //获取列表数据
 * List<T> getContent();
 */
        System.out.println("总记录数:"+pages.getTotalElements());
        System.out.println("总页数:"+pages.getTotalPages());
        System.out.println("列表数据:"+pages.getContent());

        return pages.getContent();
    }
}
