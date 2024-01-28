package model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "UserRepository")
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
    private String role;
    @Column
    private String email;
    @Column
    private Integer phone_number;
    @Column
    private Date date;
    @Column
    private Integer dashboard_dashboard_int;




}
