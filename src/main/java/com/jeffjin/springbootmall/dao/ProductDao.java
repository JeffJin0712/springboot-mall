package com.jeffjin.springbootmall.dao;

import com.jeffjin.springbootmall.dto.ProductRequest;
import com.jeffjin.springbootmall.dto.ProductRequestLombok;
import com.jeffjin.springbootmall.model.Product;

public interface ProductDao {
    public Product getProductById(Integer productId);

    public Integer createProduct(ProductRequest productRequest);

    public Integer createProductLombok(ProductRequestLombok productRequestLombok);

    public void updateProduct(Integer productId, ProductRequest productRequest);
}
