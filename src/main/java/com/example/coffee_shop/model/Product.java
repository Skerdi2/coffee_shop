package com.example.coffee_shop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;
    @Column
    private String name ;
    @Column
    private double price;
    @Column
    private String description;
    @Column
    private Integer stock_quantity;
    @ManyToOne
    private Category category;

}
