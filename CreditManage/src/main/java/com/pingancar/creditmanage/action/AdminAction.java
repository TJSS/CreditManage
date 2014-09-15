package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.AdminPojo;
import com.pingancar.creditmanage.service.AdminService;
import com.pingancar.creditmanage.util.myenum.UserType;

/**
 * Created by Administrator on 2014/9/9 0009.
 */
public class AdminAction extends ActionSupport {
    private AdminService adminService;
    private AdminPojo adminPojo;
    private String username;
    private String password;

    public String login(){
        adminPojo = new AdminPojo();
        adminPojo.setUsername(username);
        adminPojo.setPasswd(password);
        boolean result = adminService.login(adminPojo);
        if(result){
            ActionContext.getContext().getSession().put("admin", adminPojo);
            ActionContext.getContext().getSession().put("type", UserType.Admin);
            return SUCCESS;
        } else {
            addActionError("登录失败");
            return ERROR;
        }
    }

    public String logout(){
        ActionContext.getContext().getSession().put("type", UserType.Reader);
        return SUCCESS;
    }

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    public AdminPojo getAdminPojo() {
        return adminPojo;
    }

    public void setAdminPojo(AdminPojo adminPojo) {
        this.adminPojo = adminPojo;
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
}
