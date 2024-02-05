package com.token.RpgToken.repository;

import com.token.RpgToken.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    boolean existsByUserNameAndPassword(String userName, String password);

    @Query("SELECT u FROM User u WHERE u.email = :email AND u.phone = :phone")
    List<User> findByEmailAndPhone(
            @Param("email") String email,
            @Param("phone")String phone);
}
