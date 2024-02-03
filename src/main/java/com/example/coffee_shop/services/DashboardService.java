package com.example.coffee_shop.services;

import com.example.coffee_shop.dto.DashboardDTO;

public interface DashboardService {
    void save(DashboardDTO userDto);
    DashboardDTO findById(Integer id);
    void update(DashboardDTO userDto);
}
