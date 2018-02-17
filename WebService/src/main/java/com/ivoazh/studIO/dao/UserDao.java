package com.ivoazh.studIO.dao;

import com.ivoazh.studIO.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long>{
    User findByUsername(String username);

    User findUserByUsernameAndPassword(String username, String password);

}
