package com.cart.electric.home.barreragerman.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Appliance {

    private Integer idCode;

    private String name;
    private String brand;
    private String quantity;
    private double price;
    private String description;

}