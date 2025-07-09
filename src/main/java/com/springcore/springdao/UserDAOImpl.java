package com.springcore.springdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    @Override
    public int insertUser(User user) {
        String sql = "INSERT INTO users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, user.username(), user.password(), user.fullName(), user.email());
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "select * from users";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    @Override
    public User getUserById(int id) throws IllegalArgumentException {
        String sql = "select * from users where id = ?";
        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
    }


}
