package com.example.coffee_shop.converter;

import com.example.coffee_shop.dto.UserDTO;
import com.example.coffee_shop.model.User;

public class UserConverter {

public static UserDTO toDTO(User user){
    UserDTO userDTO = new UserDTO();
    userDTO.setModified_time(user.getModified_time());
    userDTO.setId(user.getId());
    userDTO.setEmail(user.getEmail());
    userDTO.setFirst_name(user.getFirst_name());
    userDTO.setLast_name(user.getLast_name());
    userDTO.setPhone_num(user.getPhone_num());
    userDTO.setRoli(user.getRoli());
    return userDTO;
}

    public static User toEntity(UserDTO userDTO){
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setModified_time(userDTO.getModified_time());
        user.setFirst_name(userDTO.getFirst_name());
        user.setLast_name(userDTO.getLast_name());
        user.setUsername(userDTO.getUsername());
        user.setPhone_num(userDTO.getPhone_num());
        user.setRoli(userDTO.getRoli());
        return user;
    }

    public static User toEntityForUpdate(UserDTO userDTO, User user){
        user.setEmail(userDTO.getEmail());
        user.setPhone_num(userDTO.getPhone_num());
        user.setUsername(userDTO.getUsername());
        user.setFirst_name(userDTO.getFirst_name());
        user.setLast_name(userDTO.getLast_name());
        user.setRoli(userDTO.getRoli());
        user.setModified_time(userDTO.getModified_time());
        return user;
    }

}
