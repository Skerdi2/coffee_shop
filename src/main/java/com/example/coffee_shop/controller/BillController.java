package com.example.coffee_shop.controller;

import com.example.coffee_shop.dto.BillDTO;
import com.example.coffee_shop.services.BillService;
import com.example.coffee_shop.services.implementation.BIllServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService bIllServ;

    @PostMapping("/save")
    public void save(@RequestBody BillDTO userDTO) {
        bIllServ.save(userDTO);
    }

    @PutMapping("/update")
    public void update(@RequestBody BillDTO userDTO) {
        bIllServ.update(userDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BillDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(bIllServ.findById(id));
    }
}
