package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductValidationService {

private final Set<ProductValidationRule> validationRules;

public ProductValidationService(Set<ProductValidationRule> validationRules) {
    this.validationRules = validationRules;
}

public void validate(Product products) {
    validationRules.forEach(s -> s.validate(products));
}

}