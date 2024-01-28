package com.example.coffee_shop.repository;

import com.example.coffee_shop.model.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepository extends JpaRepository<Dashboard,Integer> {
    
}
