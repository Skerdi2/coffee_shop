package com.example.coffee_shop.repository;

import com.example.coffee_shop.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {
}
