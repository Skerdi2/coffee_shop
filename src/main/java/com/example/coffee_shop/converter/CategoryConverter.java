package com.example.coffee_shop.converter;

import com.example.coffee_shop.dto.CategoryDTO;
import com.example.coffee_shop.model.Category;

public class CategoryConverter {

    public static CategoryDTO toDTO(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategory_id(category.getCategory_id());
        categoryDTO.setName(category.getName());
        categoryDTO.setDescription(category.getDescription());
        return categoryDTO;
    }

    public static Category toEntity(CategoryDTO categoryDTO){
        Category category = new Category();
        category.setName(categoryDTO.getName());
        category.setDescription(categoryDTO.getDescription());
        return category;
    }

    public static Category toEntityForUpdate(CategoryDTO categoryDTO, Category category){
        category.setDescription(categoryDTO.getDescription());
        category.setName(categoryDTO.getName());
        //fix dashboard
        return category;
    }
}
