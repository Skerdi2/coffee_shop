package com.example.coffee_shop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;
    @Column
    private String name;
    @Column
    private String description;
    @ManyToOne
    private Dashboard dashboard;
}
