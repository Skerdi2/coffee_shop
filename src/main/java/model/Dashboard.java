package model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "dashboard")
public class Dashboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dashboard_id;
    @Column
    private double total_rev;
    @Column
    private Integer total_customers;
    @Column
    private Date date;

}
