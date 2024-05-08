package Dio.me.Santaderdevweek2024.controller;

import Dio.me.Santaderdevweek2024.doMain.model.User;
import Dio.me.Santaderdevweek2024.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserControllers {

    private final UserService userService;


    public UserControllers(UserService userService){

        this.userService = userService;
    }

    @GetMapping("/{id}")
    private ResponseEntity<User> findById(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);

    }


    private ResponseEntity<User> create(@RequestBody User userToCreate){

    }
}
