package Dio.me.Santaderdevweek2024.service;


import Dio.me.Santaderdevweek2024.model.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
