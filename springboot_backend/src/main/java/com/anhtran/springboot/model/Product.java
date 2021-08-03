package com.anhtran.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long productId;

    @NotBlank
    private String productName;

    @NotBlank
    private int quantity;

    @NotBlank
    private double price;

    @NotBlank
    private Date saleDate;

    @NotBlank
    private String image;

    @NotBlank
    private String description;

    // Specifies a single-valued association to another entity class that has many-to-one multiplicity.
    @JoinColumn(name = "brandId", referencedColumnName = "brandId")
    @ManyToOne(fetch = FetchType.EAGER)
    private Brand brand;

    @Transient
    private MultipartFile[] imageFiles;

}
