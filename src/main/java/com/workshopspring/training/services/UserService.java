package com.workshopspring.training.services;

import com.workshopspring.training.entities.User;
import com.workshopspring.training.repositories.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

    public User insert(User user) {
       return userRepository.save(user);
    }
}
