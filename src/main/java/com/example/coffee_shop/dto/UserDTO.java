package com.example.coffee_shop.dto;

import com.example.coffee_shop.enumData.UserRole;
import lombok.Data;
import com.example.coffee_shop.model.Dashboard;

import java.sql.Date;

@Data
public class UserDTO {
    private Integer id;
    private String last_name;
    private String first_name;
    private String username;
    private String roli;
    private String email;
    private String phone_num;
    private Date modified_time;
    private Dashboard dashboard;
}
