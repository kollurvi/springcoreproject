package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void save(User user){
        String sql = "insert into users(username, password, fullname,email) values(?,?,?,?)";
        int response = jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getFullname(), user.getEmail());
        log.info("Response:{}", response);
    }

    // update and delete are assignment

    public List<User> findAll(){
        String sql = "select * from users";
      return  jdbcTemplate.query(sql, new UserRowMapper());
    }

    public User findById(int id){
        String sql = "select * from users where id=?";
        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
    }
}
