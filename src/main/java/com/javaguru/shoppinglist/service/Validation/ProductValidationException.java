package com.javaguru.shoppinglist.service.Validation;

 public class ProductValidationException extends RuntimeException {

    ProductValidationException(String message) {
        super(message);
    }
}
