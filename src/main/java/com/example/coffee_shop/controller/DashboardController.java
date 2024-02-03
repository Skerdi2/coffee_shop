package com.example.coffee_shop.controller;

import com.example.coffee_shop.dto.DashboardDTO;
import com.example.coffee_shop.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;


    @PostMapping("/save")
    public void save(@RequestBody DashboardDTO dashboardDTO) {
        dashboardService.save(dashboardDTO);
    }

    @PutMapping("/update")
    public void update(@RequestBody DashboardDTO dashboardDTO) {
        dashboardService.update(dashboardDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DashboardDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(dashboardService.findById(id));
    }

}
