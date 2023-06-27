package com.jeffjin.springbootmall.service;

import com.jeffjin.springbootmall.dto.ProductRequest;
import com.jeffjin.springbootmall.dto.ProductRequestLombok;
import com.jeffjin.springbootmall.model.Product;

public interface ProductService {
    public Product getProductById(Integer productId);

    public Integer createProduct(ProductRequest productRequest);

    public Integer createProductLombok(ProductRequestLombok productRequestLombok);

}
