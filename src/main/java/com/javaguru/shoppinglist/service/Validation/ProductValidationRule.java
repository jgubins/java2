package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;

public interface ProductValidationRule {

    void validate(Product product);

    default void isValid(Product productValidate) {
        if (productValidate.getName().length() > 30 | productValidate.getName().length() < 3) {
            throw new ProductValidationException("Product wrong length");
        }
    }
}
