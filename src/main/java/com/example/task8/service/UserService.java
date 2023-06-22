package com.example.task8.service;


import com.example.task8.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();

    public void saveUser(User user);

    public User getUserById(int id);

    public void deleteUser(int id);
}

