package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user){
        String sql = "insert into users(username, password, fullname,email) values(?,?,?,?)";
        int response = jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getFullname(), user.getEmail());
        log.info("Response:{}", response);
    }

    // update and delete are assignment
}
