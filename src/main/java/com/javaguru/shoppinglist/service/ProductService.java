package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.domain.Product;
import com.javaguru.shoppinglist.repository.ProductInMemoryRepository;
import com.javaguru.shoppinglist.service.Validation.ProductValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;
@Component
public class ProductService {

private final ProductInMemoryRepository repository;
private final ProductValidationService validationService;
@Autowired
public ProductService(ProductInMemoryRepository repository,
                   ProductValidationService validationService) {
    this.repository = repository;
    this.validationService = validationService;
}

public Long createProduct(Product products) {
    validationService.validate(products);
    Product createdProduct = repository.save(products);
    return createdProduct.getId();
}

public Product findProductById(Long id) {
    return repository.findProductById(id)
            .orElseThrow(() -> new NoSuchElementException("Task not found, id: " + id));
}
}

