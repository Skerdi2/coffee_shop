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

    public static Product toEntity(ProductDTO productDTO,Category category){
        Product product = new Product();
        product.setDescription(productDTO.getDescription());
        product.setName(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(category);
        return product;
    }

    public static Product toEntityForUpdate(Product product, Category category){
        product.setCategory(category);
        return product;
    }
}
