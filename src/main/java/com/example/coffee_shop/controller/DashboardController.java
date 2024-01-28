package com.example.coffee_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.coffee_shop.services.implementation.UserServImpl;

@RestController
@RequestMapping("/user")
public class DashboardController {

    @Autowired
    private UserServImpl userService;
}
