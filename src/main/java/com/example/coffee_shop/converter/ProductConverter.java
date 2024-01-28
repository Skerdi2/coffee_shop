package com.example.coffee_shop.converter;

import com.example.coffee_shop.dto.CategoryDTO;
import com.example.coffee_shop.dto.ProductDTO;
import com.example.coffee_shop.model.Category;
import com.example.coffee_shop.model.Product;

public class ProductConverter {

    public static ProductDTO toDTO(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProduct_id(product.getProduct_id());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setDescription(product.getDescription());
        productDTO.setStock_quantity(product.getStock_quantity());
        return productDTO;
    }

    public static Product toEntity(ProductDTO productDTO){
        Product product = new Product();
        product.setDescription(productDTO.getDescription());
        product.setName(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        return product;
    }

    public static Category toEntityForUpdate(CategoryDTO categoryDTO, Category category){
        category.setName(categoryDTO.getName());
        category.setDescription(categoryDTO.getDescription());
        return category;
    }
}
