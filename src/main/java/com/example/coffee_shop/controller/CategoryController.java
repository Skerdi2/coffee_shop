package com.example.coffee_shop.controller;

import com.example.coffee_shop.dto.CategoryDTO;
import com.example.coffee_shop.dto.ProductDTO;
import com.example.coffee_shop.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @PostMapping("/save")
    public void save(@RequestBody ProductDTO categoryDTO) {
        categoryService.save(categoryDTO.getCategory());
    }

    @PutMapping("/update")
    public void update(@RequestBody ProductDTO categoryDTO) {
        categoryService.update(categoryDTO.getCategory());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(categoryService.findById(id));
    }
}
