package com.example.coffee_shop.services;

import com.example.coffee_shop.dto.ProductDTO;

public interface ProductService{

    void save(ProductDTO productDTO);
    void update(ProductDTO productDTO);
    ProductDTO findById(Integer id);

}