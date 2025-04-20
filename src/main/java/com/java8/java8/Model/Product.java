package com.java8.java8.Model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String productId;

    private int quantity;

    private double price;
}
