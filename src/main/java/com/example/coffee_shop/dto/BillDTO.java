package com.example.coffee_shop.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BillDTO {
    private Integer bill_id;
    private double total_ammount;
    private Timestamp date_time;
    private String location;
    private Integer price;
    private Integer dashboard_dashboard_id;
}
