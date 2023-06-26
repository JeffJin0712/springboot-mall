package com.jeffjin.springbootmall.dao;

import com.jeffjin.springbootmall.model.Product;

public interface ProductDao {
    public Product getProductById(Integer productId);

}
