package com.example.coffee_shop.services.implementation;

import com.example.coffee_shop.converter.UserConverter;
import com.example.coffee_shop.dto.UserDTO;
import com.example.coffee_shop.exceptions.NotFoundException;
import jakarta.transaction.Transactional;
import com.example.coffee_shop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.coffee_shop.repository.UserRepository;
import com.example.coffee_shop.services.UserServices;

@Service
@Transactional
public class UserServImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(UserDTO userDTO) {
        User user = UserConverter.toEntity(userDTO);
        userRepository.save(user);
    }

    @Override
    public void update(UserDTO userDTO) {
        User user = userRepository.findById(userDTO.getId())
                .orElseThrow(() -> new NotFoundException("User nuk gjendet!"));
        userRepository.save(UserConverter.toEntityForUpdate(userDTO,user));
    }

    @Override
    public UserDTO findById(Integer id) {
        return UserConverter.toDTO(userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User nuk gjendet!")));
    }
}
