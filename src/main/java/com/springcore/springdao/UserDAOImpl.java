package com.springcore.springdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertUser(User user) {
        String sql = "INSERT INTO users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, user.username(), user.password(), user.fullName(), user.email());
    }

    // update and delete methods can be added similarly
}
