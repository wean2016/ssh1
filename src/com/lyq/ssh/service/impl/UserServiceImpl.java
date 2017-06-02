package com.lyq.ssh.service.impl;

import com.lyq.ssh.dao.UserDao;
import com.lyq.ssh.model.User;
import com.lyq.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hasee on 2017/5/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
