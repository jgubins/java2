package com.javaguru.shoppinglist;

import com.javaguru.shoppinglist.console.ConsoleUI;
import com.javaguru.shoppinglist.repository.ProductInMemoryRepository;
import com.javaguru.shoppinglist.service.ProductService;
import com.javaguru.shoppinglist.service.Validation.*;

import java.math.BigDecimal;
import java.util.*;

class ShoppingListApplication {



public static void main(String[] args) {
    ProductInMemoryRepository repository = new ProductInMemoryRepository();

    ProductValidationRule productNameValidationRule = new ProductNameValidationRule();
    ProductDiscountValidationRule productDiscountValidationRule = new ProductDiscountValidationRule();
    ProductPriceDiscountValidationRule productPriceDiscountValidationRule = new ProductPriceDiscountValidationRule();
    ProductValidationRule productUniqueNameValidationRule = new ProductUniqueNameValidationRule(repository);
    Set<ProductValidationRule> rules = new HashSet<>();
    rules.add(productNameValidationRule);
    rules.add(productDiscountValidationRule);
    rules.add(productPriceDiscountValidationRule);
    rules.add(productUniqueNameValidationRule);

    ProductValidationService validationService = new ProductValidationService(rules);

    ProductService productService = new ProductService(repository, validationService);

    ConsoleUI consoleUI = new ConsoleUI(productService);
    consoleUI.execute();
}
}
