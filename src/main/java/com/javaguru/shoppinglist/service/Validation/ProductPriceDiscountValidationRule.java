package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;
import org.springframework.stereotype.Component;

import static java.math.BigDecimal.valueOf;

@Component
public class ProductPriceDiscountValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) throws ProductValidationException {
        isValid(product);
        if ((product.getPrice().compareTo(valueOf(20)) < 0 && product.getDiscount().compareTo(valueOf(0)) > 0)) {
            throw new ProductValidationException("Cant add discount if price less than 20 euro ");
        }

    }
}
