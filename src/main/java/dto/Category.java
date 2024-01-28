package dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Category {
    private Integer category_id;
    private String name;
    private String description;
    private Integer dashboard_dashboard_int;
}
