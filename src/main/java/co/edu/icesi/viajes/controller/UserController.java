package co.edu.icesi.viajes.controller;


import co.edu.icesi.viajes.dto.UserDTO;
import co.edu.icesi.viajes.dto.loginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import co.edu.icesi.viajes.payload.LoginResponse;
import co.edu.icesi.viajes.service.UserService;
@RestController
@CrossOrigin
@RequestMapping("api/v1/user")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDTO userDTO){

        String id = userService.addUser(userDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody loginDTO loginDTO){

        LoginResponse loginResponse = userService.loginUser(loginDTO);

        return ResponseEntity.ok(loginResponse);
    }
}
