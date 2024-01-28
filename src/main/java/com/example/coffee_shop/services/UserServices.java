package com.example.coffee_shop.services;

import com.example.coffee_shop.dto.UserDTO;

public interface UserServices {
    void save(UserDTO userDto);
    UserDTO findById(Integer id);
    void update(UserDTO userDto);

}
