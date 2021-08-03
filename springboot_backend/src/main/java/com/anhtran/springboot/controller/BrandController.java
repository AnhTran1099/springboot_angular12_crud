package com.anhtran.springboot.controller;

import com.anhtran.springboot.model.Brand;
import com.anhtran.springboot.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/brand")
@CrossOrigin(origins = "http://localhost:4200")
public class BrandController {

    @Autowired
    BrandService brandService;

    @PostMapping("/add")
        public Brand saveBrand(@RequestBody Brand brand){
            return brandService.saveBrand(brand);
    }


    @GetMapping("/list")
    public List<Brand> findAllBrand(){
        return brandService.getAllBrand();
    }
}
