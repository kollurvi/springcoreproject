package com.springcore.springdao;

import java.util.List;

public interface UserDAO {

    int insertUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);
}
