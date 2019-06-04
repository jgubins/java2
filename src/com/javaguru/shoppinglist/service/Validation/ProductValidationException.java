package com.javaguru.shoppinglist.service.Validation;

public class ProductValidationException extends RuntimeException {

    public ProductValidationException(String message) {
        super(message);
    }
}
