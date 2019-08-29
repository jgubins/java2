package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;
import com.javaguru.shoppinglist.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductUniqueNameValidationRule implements ProductValidationRule {
    private final ProductRepository repository;

    @Autowired
    public ProductUniqueNameValidationRule(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void validate(Product product) {
        isValid(product);
        if (repository.existsByName(product.getName())) {
            throw new ProductValidationException("Product name must be unique.");
        }
    }
}





