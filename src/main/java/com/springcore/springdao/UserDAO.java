package com.springcore.springdao;

import java.util.List;

public interface UserDAO {
    void save(User user);
    List<User> findAll();
    User findById(int id)throws UserNotFoundException;
}
