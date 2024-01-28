package model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
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
    @Column
    private Integer category_category_int;

}
