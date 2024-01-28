package com.example.coffee_shop.model;

import com.example.coffee_shop.enumData.UserRole;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String last_name;
    @Column
    private String first_name;
    @Column
    private String username;
    @Column
    private String roli;
    @Column
    private String email;
    @Column
    private String phone_num;
    @Column
    private Date modified_time;
    @ManyToOne
    private Dashboard dashboard;




}
