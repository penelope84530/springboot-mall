package com.penelope.springbootmall.service.impl;

import com.penelope.springbootmall.dao.ProductDao;
import com.penelope.springbootmall.model.Product;
import com.penelope.springbootmall.service.ProductService;
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
