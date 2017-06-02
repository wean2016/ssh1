package com.lyq.ssh.action;

import com.lyq.ssh.model.User;
import com.lyq.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by hasee on 2017/6/1.
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    /*模型*/
    private User user = new User();
    /*注入service*/
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        userService.saveUser(user);
        return SUCCESS;
    }
}
