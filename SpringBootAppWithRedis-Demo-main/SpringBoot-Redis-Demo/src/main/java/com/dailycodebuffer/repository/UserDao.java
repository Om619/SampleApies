package com.dailycodebuffer.repository;

import com.dailycodebuffer.model.User;

import java.util.List;

public interface UserDao {
    boolean saveUser(User user);

    List<Object> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
}
