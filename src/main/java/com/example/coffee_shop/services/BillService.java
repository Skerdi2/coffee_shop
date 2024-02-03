package com.example.coffee_shop.services;

import com.example.coffee_shop.dto.BillDTO;

public interface BillService {
    void save(BillDTO userDto);
    BillDTO findById(Integer id);
    void update(BillDTO userDto);
}
