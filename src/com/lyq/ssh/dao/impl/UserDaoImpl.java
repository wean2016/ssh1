package com.lyq.ssh.dao.impl;

import com.lyq.ssh.dao.UserDao;
import com.lyq.ssh.model.User;
import org.hibernate.SessionFactory;

/**
 * Created by hasee on 2017/5/31.
 */
public class UserDaoImpl implements UserDao{

    SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
