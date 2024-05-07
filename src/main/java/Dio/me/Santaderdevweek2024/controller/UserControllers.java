package Dio.me.Santaderdevweek2024.controller;

import Dio.me.Santaderdevweek2024.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserControllers {

    private UserService userService;


    public UserControllers(UserService userService){

        this.userService = userService;
    }

}
