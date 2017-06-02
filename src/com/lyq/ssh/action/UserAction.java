package com.lyq.ssh.action;

import com.lyq.ssh.model.User;
import com.lyq.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by hasee on 2017/6/1.
 */
@Controller
@ParentPackage("struts-default")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {

    /*模型*/
    private User user = new User();
    /*注入service*/
    @Autowired
    private UserService userService;


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

    @Action(value = "save", results = {@Result(name = "success", location = "/success.jsp")})
    @Override
    public String execute() throws Exception {
        userService.saveUser(user);
        return SUCCESS;
    }
}
