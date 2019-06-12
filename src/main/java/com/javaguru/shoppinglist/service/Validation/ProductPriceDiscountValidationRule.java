package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;

public class ProductPriceDiscountValidationRule implements ProductValidationRule {
@Override
public void validate(Product product) throws ProductValidationException {
    isValid(product);
    if (product.getPrice().signum() < 20.00 && product.getDiscount().signum()> 0){
        throw new  ProductValidationException("Cant add discount if price less than 20euro ");
    }
}
}
