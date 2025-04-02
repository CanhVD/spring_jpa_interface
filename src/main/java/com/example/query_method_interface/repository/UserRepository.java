package com.example.query_method_interface.repository;

import com.example.query_method_interface.dto.UserInfoProjection;
import com.example.query_method_interface.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("""
        SELECT
            username,
            email,
            status,
            create_by,
            update_by
        FROM users u
    """)
    List<UserInfoProjection> findAllUserInfo();

    interface UserInfoProjection {
        String getUsername();
        String getEmail();
        Integer getStatus();
        String getCreateBy();
        String getUpdateBy();
    }
}
