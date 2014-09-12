package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.UserPojo;
import com.pingancar.creditmanage.service.UserService;

/**
 * Created by kx on 2014/9/12.
 */
public class UserAction extends ActionSupport{
    private UserService userService;
    private UserPojo userPojo;
    public String registerUser(){
        boolean result=userService.registerUser(userPojo);
        if(result){
            return SUCCESS;
        } else {
            addActionError("注册错误");
            return ERROR;
        }
    }
    public String login(){
        boolean result=userService.login(userPojo);
        if(result){
            return SUCCESS;
        } else {
            addActionError("登陆错误");
            return ERROR;
        }
    }
    public String updateUser(){
        boolean result=userService.updateUser(userPojo);
        if(result){
            return SUCCESS;
        } else {
            addActionError("更新错误");
            return ERROR;
        }
    }
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
