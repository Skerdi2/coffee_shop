package com.example.coffee_shop.controller;

import com.example.coffee_shop.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.coffee_shop.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices userService;

    @PostMapping("/save")
    public void save(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
    }

    @PutMapping("/update")
    public void update(@RequestBody UserDTO userDTO) {
        userService.update(userDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(userService.findById(id));
    }

}
