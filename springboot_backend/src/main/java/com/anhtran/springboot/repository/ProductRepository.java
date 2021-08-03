package com.anhtran.springboot.repository;

import com.anhtran.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


//    boolean existsById(String id);
//    Product findByName(String productName);
}
