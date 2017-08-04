package com.example.domain.repository;

import com.example.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Aubergine
 * zhaoshuangquan@allinmd.cn
 * 2017-08-04 10:03
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}
