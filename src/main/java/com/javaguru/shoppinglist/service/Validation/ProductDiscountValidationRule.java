package com.javaguru.shoppinglist.service.Validation;

import com.javaguru.shoppinglist.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDiscountValidationRule implements ProductValidationRule{
@Override
public void validate(Product product) {
    isValid(product);
    if (product.getDiscount().signum()> 80.00 | product.getDiscount().signum() < 0.00){
        throw new  ProductValidationException("Wrong discount");
    }


}
}
