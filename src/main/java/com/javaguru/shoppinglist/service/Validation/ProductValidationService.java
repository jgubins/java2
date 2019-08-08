package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
@Component
public class ProductValidationService {

private final Set<ProductValidationRule> validationRules;

public ProductValidationService(Set<ProductValidationRule> validationRules) {
    this.validationRules = validationRules;
}

public void validate(Product products) {
    validationRules.forEach(s -> s.validate(products));
}

}