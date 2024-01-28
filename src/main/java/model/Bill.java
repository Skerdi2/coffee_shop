package model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "bill")
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
    @Column
    private Integer dashboard_dashboard_id;

}
