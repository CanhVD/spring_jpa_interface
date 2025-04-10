package com.example.query_method_interface.service;

import com.example.query_method_interface.dto.UserDTO;
import com.example.query_method_interface.dto.UserInfoProjection;
import com.example.query_method_interface.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Cách 1 để lấy danh sách user
    public List<UserInfoProjection> getListUsers() {
        return userRepository.findAllUserInfo();
    }

    // Cách 2 để lấy danh sách user
    public List<UserInfoProjection> getListUsers2() {
        return userRepository.findAllUserInfo2();
    }

    // Cách 3 để lấy danh sách user
    public List<UserDTO> getListUsers3() {
        return userRepository.findAllUserInfo2().stream()
                .map(UserDTO::of)
                .toList();
    }
}
