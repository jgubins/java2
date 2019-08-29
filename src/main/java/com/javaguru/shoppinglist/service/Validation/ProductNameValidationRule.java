package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductNameValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) {
        isValid(product);
        if (product.getName().length() > 25 | product.getName().length() < 3) {
            throw new ProductValidationException("Wrong name length");
        }
    }
}

