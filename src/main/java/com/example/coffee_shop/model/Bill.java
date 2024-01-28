package com.example.coffee_shop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "bill")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bill_id;
    @Column
    private double total_ammount;
    @Column
    private Timestamp date_time;
    @Column
    private String location;
    @Column
    private Integer price;
    @ManyToOne
    private Dashboard dashboard;

}
