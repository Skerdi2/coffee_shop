package dto;


import lombok.Data;

import java.sql.Date;

@Data
public class User {
    private Integer id;

    private String last_name;
    private String first_name;
    private String username;
    private String role;
    private String email;
    private Integer phone_number;
    private Date date;
}
