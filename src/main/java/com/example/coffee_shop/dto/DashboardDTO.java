package com.example.coffee_shop.dto;

import lombok.Data;

import java.sql.Date;
@Data
public class DashboardDTO {
    private Integer dashboard_id;
    private double total_rev;
    private Integer total_customers;
    private Date date;
}
