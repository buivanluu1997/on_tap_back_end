package com.example.product_manager.service;

import com.example.product_manager.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {

    Page<Product> searchNameAndCategoryId(String name, Integer categoryId, Pageable pageable);

    void addProduct(Product product);

    void deleteProduct(Integer id);

    Product findByIdProduct(Integer id);

    void updateProduct(Product product);
}
