package com.anhtran.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long brandId;

    @NotBlank(message = "không được bỏ trống")
    @Size(min = 1, message = "không được bỏ trống")
    private String brandName;

    @NotBlank
    private String description;

    @NotBlank
    private String logo;

    @Transient
    private MultipartFile[] logoFiles;

    @JsonIgnore
    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private Set<Product> productSet;

}
