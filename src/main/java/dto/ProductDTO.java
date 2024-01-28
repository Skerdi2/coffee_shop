package dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Integer product_id;
    private String name ;
    private double price;
    private String description;
    private Integer stock_quantity;
    private Integer category_category_int;

}
