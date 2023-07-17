package com.penelope.springbootmall.dao;

import com.penelope.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
