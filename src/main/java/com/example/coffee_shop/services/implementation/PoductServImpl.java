package com.example.coffee_shop.services.implementation;

import com.example.coffee_shop.controller.ProductController;
import com.example.coffee_shop.converter.ProductConverter;
import com.example.coffee_shop.dto.ProductDTO;
import com.example.coffee_shop.exceptions.NotFoundException;
import com.example.coffee_shop.model.Product;
import com.example.coffee_shop.repository.CategoryRepository;
import com.example.coffee_shop.repository.ProductRepository;
import com.example.coffee_shop.services.ProductService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoductServImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void save(ProductDTO productDTO) {
        Product product = ProductConverter.toEntity(productDTO,
                categoryRepository.findById(productDTO.getCategory().getCategory_id())
                        .orElseThrow(()-> new NotFoundException("Categoria nuk u gjet")));
        productRepository.save(product);
    }


    @Override
    public void update(ProductDTO productDTO) {
        Product product
                = ProductConverter.toEntityForUpdate(
                productRepository.findById(productDTO.getProduct_id())
                        .orElseThrow(() -> new NotFoundException("Produkti nuk u gjet")),
                categoryRepository.findById(productDTO.getCategory().getCategory_id())
                        .orElseThrow(() -> new NotFoundException("Category nuk u gjet"))
        );

        productRepository.save(product);
    }

    @Override
    public ProductDTO findById(Integer id) {
        return ProductConverter.toDTO(productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Produkti nuk u gjet")));
    }
}
