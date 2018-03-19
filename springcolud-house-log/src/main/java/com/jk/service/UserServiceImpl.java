package com.jk.service;

import com.jk.model.test.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserByUserName(String username) {
        return null;
    }
}
