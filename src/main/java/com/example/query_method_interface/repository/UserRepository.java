package com.example.query_method_interface.repository;

import com.example.query_method_interface.dto.UserInfoProjection;
import com.example.query_method_interface.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = """
        SELECT
            username,
            email,
            status,
            create_by,
            update_by
        FROM `users` u
    """, nativeQuery = true)
    List<UserInfoProjection> findAllUserInfo();

    @Query("""
        SELECT u.username AS username,
               u.email AS email,
               u.status AS status,
               u.createBy AS createBy,
               u.updateBy AS updateBy
        FROM User u
    """)
    List<UserInfoProjection> findAllUserInfo2();
}
