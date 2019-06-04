package com.javaguru.shoppinglist.domain;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Product {
MathContext mc = new MathContext(4);
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private BigDecimal discount;



    public Long getId() {
    return id;
}
    public void setId(Long id) {
    this.id = id;
}
    public String getName() {
    return name;
}
    public void setName(String name) {
    this.name = name;
}
    public void setPrice (BigDecimal price){this.price = price;}
    public BigDecimal getPrice (){return price; }
    public String getDescription() {
    return description;
}
    public void setDescription(String description) {
    this.description = description;
}
    public void setDiscount(BigDecimal discount) { this.discount = discount; }
    public BigDecimal getDiscount() { return discount; }


    public BigDecimal actualPrice() {
    BigDecimal actualPrice = price.subtract(discount.multiply(price.divide(BigDecimal.valueOf(100.00),mc))) ;
    return actualPrice.setScale(2, RoundingMode.FLOOR);

}
}
