package services.implementation;

import controller.UserController;
import dto.UserDTO;
import jakarta.transaction.Transactional;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import services.UserServices;

@Service
@Transactional
public class UserSerImpl implements UserServices {
    @Autowired
    private UserRepository userRepo;
    @Override
    public void save(UserDTO userDto){
        User user = UserConverter
    }

}
