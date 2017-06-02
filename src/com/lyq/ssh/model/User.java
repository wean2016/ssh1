package com.lyq.ssh.model;

/**
 * Created by hasee on 2017/5/31.
 */
public class User {

    private Integer userId;

    private String username;

    private String password;



    public User() {
    }

    public User(Integer userId, String username, String password) {
        super();
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", username=" + username
                + ", password=" + password + "]";
    }



}

