package com.example.task8.dao;


import com.example.task8.entity.User;

import java.util.List;

public interface UserDao {
   public List<User> getAllUser();

  public void saveUser(User user);

  public   User getUserById(int id);

  public   void deleteUser(int id);
}

