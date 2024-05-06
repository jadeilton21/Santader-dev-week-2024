package Dio.me.Santaderdevweek2024.service.impl;

import Dio.me.Santaderdevweek2024.doMain.model.User;
import Dio.me.Santaderdevweek2024.doMain.repository.UserRepository;
import Dio.me.Santaderdevweek2024.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccoutNumero(userToCreate.getAccout().getNumero())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);

    }
}
