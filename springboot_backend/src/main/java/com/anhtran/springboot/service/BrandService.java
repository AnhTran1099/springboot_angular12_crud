package com.anhtran.springboot.service;

import com.anhtran.springboot.model.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> getAllBrand();

    Brand findByBrandName(String brandName);

    Brand findBrandById(Long brandId);

    Brand saveBrand(Brand brand);

    void updateBrand(Brand brand);

    void deleteBrandById(Long brandId);


}
