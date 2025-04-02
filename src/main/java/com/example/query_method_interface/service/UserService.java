package com.example.query_method_interface.service;

import com.example.query_method_interface.dto.UserDTO;
import com.example.query_method_interface.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getListUsers() {
        return userRepository.findAllUserInfo().stream().map(UserDTO::of).toList();
    }
}
