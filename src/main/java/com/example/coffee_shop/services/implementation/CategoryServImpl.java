package com.example.coffee_shop.services.implementation;

import com.example.coffee_shop.converter.CategoryConverter;
import com.example.coffee_shop.dto.CategoryDTO;
import com.example.coffee_shop.exceptions.NotFoundException;
import com.example.coffee_shop.model.Category;
import com.example.coffee_shop.repository.CategoryRepository;
import com.example.coffee_shop.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void save(CategoryDTO categoryDTO) {
        Category category = CategoryConverter.toEntity(categoryDTO);
        categoryRepository.save(category);
    }


    @Override
    public void update(CategoryDTO categoryDTO) {
        Category category = categoryRepository.findById(categoryDTO.getCategory_id())
                .orElseThrow(() -> new NotFoundException("Dashboard nuk gjendet!"));
        categoryRepository.save(CategoryConverter.toEntityForUpdate(categoryDTO,category));
    }

    @Override
    public CategoryDTO findById(Integer id) {
        return CategoryConverter.toDTO(categoryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Produkti nuk u gjet")));
    }
}
