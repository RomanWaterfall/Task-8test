package com.example.task8.service;

import com.example.task8.dao.UserDao;
import com.example.task8.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override

    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    @Transactional
    public void saveUser(User user) {

        userDao.saveUser(user);

    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }
}
