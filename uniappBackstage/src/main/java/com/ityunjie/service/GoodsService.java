package com.ityunjie.service;

import com.ityunjie.dao.GoodsIDao;
import com.ityunjie.domain.Goods;


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
public class GoodsService {
    @Autowired
    private GoodsIDao goodsIDao;

/*
* //        int pageNo = 0;
//        int pageSize = 2;
//        PageRequest pageable = PageRequest.of(pageNo,pageSize);
//        Specification<Goods> specification = new Specification<Goods>(){
        //构造查询条件
        /**
         *	root	：Root接口，代表查询的实体类，
         *	query	：代表一个顶层查询对象，用来自定义查询
         *	cb		：用来构建查询，此对象里有很多条件方法
         *  return: Predicate 类型，代表一个查询条件
         **/
//            @Override
//            public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//                //cb:构建查询，添加查询方式   like：模糊匹配
//                //root：从实体 Goods 对象中按照 goodsId 属性进行查询
//                Path path = root.get("goodsId");
//                return cb.gt(path,0);
//            }
//        };
//        Page<Goods> pages = goodsIDao.findAll(specification,pageable);
//        System.out.println(pages.getTotalElements());
//        return pages.getContent();
    /**
     * 构造分页参数
     * 		Pageable : 接口
     * 			PageRequest实现了Pageable接口，调用构造方法的形式构造
     * 				第一个参数：页码（从0开始）
     * 				第二个参数：每页查询条数
     */

    public List<Goods> findAll() {
        return goodsIDao.findAll();
    }
    public List<Goods> findPage(int page){
        Pageable pageable = PageRequest.of(page, 5);
        Specification<Goods>  specification = new Specification<Goods>() {
            @Override
            public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                return criteriaBuilder.like(root.get("goodsInfo").as(String.class),"% %");
            }
        } ;
        Page<Goods> pages = goodsIDao.findAll(specification, pageable);
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
//    获取全部商品信息
    public List<Goods> goodsAll(){
    return goodsIDao.findAll();
    }
//    根据goodsId查询商品信息
    public Goods findByGoodsId(Integer goodsId){
        return goodsIDao.findByGoodsId(goodsId);
    }
}
