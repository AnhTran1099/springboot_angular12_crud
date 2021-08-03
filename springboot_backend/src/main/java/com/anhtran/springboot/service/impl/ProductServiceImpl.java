package com.anhtran.springboot.service.impl;

import com.anhtran.springboot.model.Product;
import com.anhtran.springboot.repository.ProductRepository;
import com.anhtran.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> saveProducts(List<Product> products) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

//    @Override
//    public Product getProductById(long productId) {
//        return null;
//    }
}
