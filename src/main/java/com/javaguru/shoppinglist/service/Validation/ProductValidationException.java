package com.javaguru.shoppinglist.service.Validation;

 class ProductValidationException extends RuntimeException {

    ProductValidationException(String message) {
        super(message);
    }
}
