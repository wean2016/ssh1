package com.lyq.ssh.service.impl;

import com.lyq.ssh.dao.UserDao;
import com.lyq.ssh.model.User;
import com.lyq.ssh.service.UserService;

/**
 * Created by hasee on 2017/5/31.
 */
public class UserServiceImpl implements UserService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
