package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAll() {
        return userDao.getAll();
    }
}
