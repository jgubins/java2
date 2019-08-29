package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.domain.Product;
import com.javaguru.shoppinglist.repository.ProductRepository;
import com.javaguru.shoppinglist.service.Validation.ProductValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductService {
    private final ProductRepository repository;
    private final ProductValidationService validationService;
@Autowired
    public ProductService(ProductRepository repository, ProductValidationService validationService) {
        this.repository = repository;
        this.validationService = validationService;
    }
    @Transactional
    public Long createProduct(Product products) {
    validationService.validate(products);
    Product createdProduct = repository.save(products);
    return createdProduct.getId();
    }

    public Product findProductById(Long id) {
    return repository.findProductById(id)
            .orElseThrow(() -> new IllegalArgumentException("Product not found, id: " + id));
    }
}


