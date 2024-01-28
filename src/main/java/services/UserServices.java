package services;

import dto.UserDTO;

public interface UserServices {
    void save(UserDTO userDto);
    UserDTO findById(Integer id);
    void update(UserDTO userDto);

}
