package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductDiscountValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) {
        isValid(product);
        if (product.getDiscount().compareTo(BigDecimal.valueOf(80.00)) > 0 | product.getDiscount().compareTo(BigDecimal.valueOf(0.00)) < 0) {
            throw new ProductValidationException("Wrong discount");
        }


    }
}
