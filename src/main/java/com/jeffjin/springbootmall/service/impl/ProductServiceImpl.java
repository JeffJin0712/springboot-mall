package com.jeffjin.springbootmall.service.impl;

import com.jeffjin.springbootmall.dao.ProductDao;
import com.jeffjin.springbootmall.model.Product;
import com.jeffjin.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
