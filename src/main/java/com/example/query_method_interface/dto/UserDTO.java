package com.example.query_method_interface.dto;

import lombok.*;

import java.util.Objects;

@Setter
@Getter
@Builder
public class UserDTO {
    private String username;
    private String email;
    private Integer status;

    public static UserDTO of(UserInfoProjection entity) {
        if (Objects.isNull(entity))
            return null;

//        return UserDTO.builder()
//                .username(entity.getUsername())
//                .email(entity.getEmail())
//                .status(entity.getStatus())
//                .build();
        return null;
    }
}

