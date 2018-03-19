package com.jk.service;

import com.jk.model.test.User;

public interface UserService {
    User findUserByUserName(String username);
}
