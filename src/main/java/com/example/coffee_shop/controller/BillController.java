package com.example.coffee_shop.controller;

import com.example.coffee_shop.services.implementation.BIllServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BIllServImpl bIllServ;
}
