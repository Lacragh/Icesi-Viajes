package service;

import domain.User;
import dto.UserDTO;
import dto.loginDTO;
import payload.response.LoginResponse;

public interface UserService extends GenericService<User, Integer>{

    String addUser(UserDTO userDTO);
    LoginResponse loginUser(loginDTO loginDTO);
}
