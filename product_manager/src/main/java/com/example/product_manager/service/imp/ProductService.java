package com.example.product_manager.service.imp;

import com.example.product_manager.model.Product;
import com.example.product_manager.repository.IProductRepository;
import com.example.product_manager.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Page<Product> searchNameAndCategoryId(String name, Integer categoryId, Pageable pageable) {
        if (categoryId != null) {
            return productRepository.findByNameContainingAndCategoryId(name, categoryId, pageable);
        } else {
            return productRepository.findByNameContaining(name, pageable);
        }
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findByIdProduct(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }
}
