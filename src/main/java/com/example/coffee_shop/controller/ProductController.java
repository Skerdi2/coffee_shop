package com.example.coffee_shop.controller;

import com.example.coffee_shop.dto.ProductDTO;
import com.example.coffee_shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public void save(@RequestBody ProductDTO productDTO) {
        productService.save(productDTO);
    }

    @PutMapping("/update")
    public void update(@RequestBody ProductDTO productDTO) {
        productService.update(productDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(productService.findById(id));
    }
}
