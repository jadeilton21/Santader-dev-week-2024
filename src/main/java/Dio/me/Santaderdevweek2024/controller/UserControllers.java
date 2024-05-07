package Dio.me.Santaderdevweek2024.controller;

import Dio.me.Santaderdevweek2024.doMain.model.User;
import Dio.me.Santaderdevweek2024.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserControllers {

    private final UserService userService;


    public UserControllers(UserService userService){

        this.userService = userService;
    }


    private ResponseEntity<User> findById(@PathVariable Long id){

    }
}
