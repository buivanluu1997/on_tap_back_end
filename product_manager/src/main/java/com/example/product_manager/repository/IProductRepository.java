package com.example.product_manager.repository;

import com.example.product_manager.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findByNameContainingAndCategoryId(String name, Integer categoryId, Pageable pageable);

    Page<Product> findByNameContaining(String name, Pageable pageable);
}
