package com.anhtran.springboot.repository;

import com.anhtran.springboot.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
    Brand findByBrandId(Long brandId);

    Brand findByBrandName(String brandName);
}
