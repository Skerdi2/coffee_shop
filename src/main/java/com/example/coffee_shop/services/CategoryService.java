package com.example.coffee_shop.services;

import com.example.coffee_shop.dto.CategoryDTO;

public interface CategoryService {
    void save(CategoryDTO userDto);
    CategoryDTO findById(Integer id);
    void update(CategoryDTO userDto);
}
