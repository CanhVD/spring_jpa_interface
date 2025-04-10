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

    // Cách 1 để lấy danh sách user
    @GetMapping
    public ResponseEntity<?> getListUser1() {
        return ResponseEntity.ok(userService.getListUsers());
    }

    // Cách 2 để lấy danh sách user
    @GetMapping("cach2")
    public ResponseEntity<?> getListUser2() {
        return ResponseEntity.ok(userService.getListUsers2());
    }

    // Cách 3 để lấy danh sách user (build được nhưng ko run được)
    @GetMapping("cach3")
    public ResponseEntity<?> getListUser3() {
        return ResponseEntity.ok(userService.getListUsers3());
    }
}
