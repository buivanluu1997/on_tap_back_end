package com.example.product_manager.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private String title;
    @Column(name = "url_image")
    private String urlImage;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
