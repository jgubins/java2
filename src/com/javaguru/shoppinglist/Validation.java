package com.javaguru.shoppinglist;

public class Validation {
    public void isValid(Product productValidate) throws Exception {
        if (productValidate.getName().length() > 30 | productValidate.getName().length() < 3) {
            throw new Exception("Wrong name length");
        }
    }
}
