package com.example.query_method_interface.controller;

import com.example.query_method_interface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<?> test() {
        return ResponseEntity.ok(userService.getListUsers());
    }
}
