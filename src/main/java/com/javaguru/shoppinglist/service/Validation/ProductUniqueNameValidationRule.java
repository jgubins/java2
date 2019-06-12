package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;
import com.javaguru.shoppinglist.repository.ProductInMemoryRepository;

public class ProductUniqueNameValidationRule implements ProductValidationRule {
private final ProductInMemoryRepository repository;
public ProductUniqueNameValidationRule(ProductInMemoryRepository repository) {
    this.repository = repository;
}
@Override
public void validate(Product product) {
    isValid(product);
    if (repository.existsByName(product.getName())) {
        throw new ProductValidationException("Task name must be unique.");
    }
}
}





