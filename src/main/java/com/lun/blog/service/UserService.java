package com.lun.blog.service;

import com.lun.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
