package com.jerry.springboot_jpa_test.service;

import com.jerry.springboot_jpa_test.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User save(User user);
    User findById(String id);
    void delete(User user);
    List<User> findAll();
}
