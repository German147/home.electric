package com.cart.electric.home.barreragerman.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cart_tbl")
@Data @AllArgsConstructor @NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "user")
    private String userName;

    @Column(name = "appliance")
    private String applianceName;

    @Column(name = "brand")
    private String brand;

    @Column(name = "price_per_unit")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "total_amount")
    private Double totalAmount;
}
