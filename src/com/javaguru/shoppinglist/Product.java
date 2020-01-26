package com.javaguru.shoppinglist;

import java.math.BigDecimal;

public class Product {
    private String category;
    private BigDecimal discount;
    private String description;
    private Long id;
    private String name;
    private BigDecimal price;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        if (discount.compareTo(BigDecimal.valueOf(100)) < 0 && discount.compareTo(BigDecimal.valueOf(0)) > 0) {
            this.discount = discount;
        } else {
            System.out.println("Incorrect input! Discount should be greater that 0");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
        if (name.length() >= 3 && name.length() <= 32) {
            this.name = name;
        } else {
            System.out.println("Name does not meet length requirements");
        }
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) > 0) {
            this.price = price;
        } else {
            System.out.println("Incorrect input! Price should be greater than 0");
        }
    }

}