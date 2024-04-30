package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.User;
import co.edu.icesi.viajes.dto.UserDTO;
import co.edu.icesi.viajes.dto.loginDTO;
import co.edu.icesi.viajes.payload.LoginResponse;

public interface UserService extends GenericService<User, Integer>{

    String addUser(UserDTO userDTO);
    LoginResponse loginUser(loginDTO loginDTO);
}
