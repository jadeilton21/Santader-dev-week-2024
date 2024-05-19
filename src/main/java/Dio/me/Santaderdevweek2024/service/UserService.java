package Dio.me.Santaderdevweek2024.service;


import Dio.me.Santaderdevweek2024.doMain.model.User;


public interface UserService {
    User findById(Long id);
    
    User create(User userToCreate);
}
