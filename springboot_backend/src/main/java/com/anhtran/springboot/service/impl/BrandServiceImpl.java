package com.anhtran.springboot.service.impl;

import com.anhtran.springboot.model.Brand;
import com.anhtran.springboot.repository.BrandRepository;
import com.anhtran.springboot.service.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    BrandRepository brandRepository;

    @Override
    public List<Brand> getAllBrand() {
        return brandRepository.findAll(Sort.by(Sort.Direction.DESC, "brandId"));
    }

    @Override
    public Brand findByBrandName(String brandName) {
        return brandRepository.findByBrandName(brandName);
    }

    @Override
    public Brand findBrandById(Long brandId) {
        return brandRepository.findByBrandId(brandId);
    }

    @Override
    public Brand saveBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public void updateBrand(Brand brand) {

    }

    @Override
    public void deleteBrandById(Long brandId) {
        brandRepository.deleteById(brandId);
    }
}
