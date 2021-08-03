package com.anhtran.springboot.controller;

import com.anhtran.springboot.model.Product;
import com.anhtran.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }


    @GetMapping("/list")
    public List<Product> findAllProducts(){
        return productService.getProducts();
    }

}
