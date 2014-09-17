package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.UserPojo;
import com.pingancar.creditmanage.service.UserService;
import com.pingancar.creditmanage.util.myenum.UserType;

/**
 * Created by kx on 2014/9/12.
 */
public class UserAction extends ActionSupport{
    private UserService userService;
    private UserPojo userPojo;
    private String username;
    private String password;
    private String carnum;
    private String phone;
    private String email;

    public String registerUser(){
        userPojo = new UserPojo();
        userPojo.setUsername(username);
        userPojo.setCarnumber(carnum);
        userPojo.setPasswd(password);
        userPojo.setCon(phone);
        userPojo.setEmail(email);

        //System.out.println(username);
        boolean result=userService.registerUser(userPojo);
        if(result){
            return SUCCESS;
        } else {
            addActionError("注册错误");
            return ERROR;
        }
    }
    public String login(){
        userPojo = new UserPojo();
        userPojo.setPasswd(password);
        userPojo.setUsername(username);
        boolean result=userService.login(userPojo);
        if(result){
            ActionContext.getContext().getSession().put("user", userPojo);
            ActionContext.getContext().getSession().put("type", UserType.Common);
            return SUCCESS;
        } else {
            addActionError("登陆错误");
            return ERROR;
        }
    }
    public String logout(){
        ActionContext.getContext().getSession().put("type", UserType.Reader);
        return SUCCESS;
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

    public UserPojo getUserPojo() {
        return userPojo;
    }

    public void setUserPojo(UserPojo userPojo) {
        this.userPojo = userPojo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
