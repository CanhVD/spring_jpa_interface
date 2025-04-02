package com.example.query_method_interface.dto;

import com.example.query_method_interface.repository.UserRepository;
import lombok.*;

import java.util.Objects;

@Setter
@Getter
public class UserDTO {
    private String username;
    private String email;
    private Integer status;
    private String createBy;
    private String updateBy;

    public static UserDTO of(UserRepository.UserInfoProjection entity) {
        if (Objects.isNull(entity))
            return null;

        UserDTO dto = new UserDTO();
        dto.setUsername(entity.getUsername());
        dto.setEmail(entity.getEmail());
        dto.setStatus(entity.getStatus());
        dto.setCreateBy(entity.getCreateBy());
        dto.setUpdateBy(entity.getUpdateBy());
       return dto;
    }
}
