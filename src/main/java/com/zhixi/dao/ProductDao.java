package com.zhixi.dao;

import com.zhixi.pojo.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName ProductDao
 * @Author zhangzhixi
 * @Description
 * @Date 2022-2-17 16:21
 * @Version 1.0
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product, Long> {

}
