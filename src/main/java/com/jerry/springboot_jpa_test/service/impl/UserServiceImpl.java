package com.jerry.springboot_jpa_test.service.impl;

import com.jerry.springboot_jpa_test.dao.UserDao;
import com.jerry.springboot_jpa_test.entity.User;
import com.jerry.springboot_jpa_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User save(User user) {
       return userDao.save(user);
    }

    @Override
    public User findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
