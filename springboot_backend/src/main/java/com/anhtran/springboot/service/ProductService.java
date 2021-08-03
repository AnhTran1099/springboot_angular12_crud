package com.anhtran.springboot.service;

import com.anhtran.springboot.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> saveProducts(List<Product> products);


    List<Product> getProducts();

//    Product getProductById(long productId);

}
