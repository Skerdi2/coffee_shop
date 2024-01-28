package model;

import jakarta.persistence.*;

@Entity
@Table (name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Integer dashboard_dashboard_int;
}
