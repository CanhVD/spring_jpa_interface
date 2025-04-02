package com.example.query_method_interface.dto;

public interface UserInfoProjection {
    String getUsername();
    String getEmail();
    Integer getStatus();
    String getCreateBy();
    String getUpdateBy();
}
