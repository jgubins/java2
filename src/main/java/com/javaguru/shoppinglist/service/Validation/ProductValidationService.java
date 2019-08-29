package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ProductValidationService {

private final Set<ProductValidationRule> validationRules;

public ProductValidationService(Set<ProductValidationRule> validationRules) {
    this.validationRules = validationRules;
}

public void validate(Product products) {
    validationRules.forEach(s -> s.validate(products));
}

}