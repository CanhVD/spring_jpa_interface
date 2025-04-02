package com.example.query_method_interface.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private Integer status;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "username")
    private LocalDateTime username;

}