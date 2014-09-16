package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.ShopInfoPojo;
import com.pingancar.creditmanage.pojo.ShopUserPojo;
import com.pingancar.creditmanage.service.ShopService;
import com.pingancar.creditmanage.util.myenum.ShopInfoField;
import com.pingancar.creditmanage.util.myenum.UserType;

import java.util.List;

/**
 * Created by kx on 2014/9/13
 */
public class ShopAction extends ActionSupport{
    private ShopService shopService;
    private ShopInfoPojo shopInfoPojo;
    private ShopUserPojo shopUserPojo;
    private String username;
    private String password;
    private List<ShopInfoField> shopInfoFields;
    private List<String> valueList;

    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }

    public List<ShopInfoField> getShopInfoFields() {

        return shopInfoFields;
    }

    public void setShopInfoFields(List<ShopInfoField> shopInfoFields) {
        this.shopInfoFields = shopInfoFields;
    }

    public String queryShopInfo(){
        List<ShopInfoPojo> shopInfo= shopService.queryShopInfo(shopInfoFields,valueList);
        ActionContext.getContext().getSession().put("shopInfo", shopInfo);
        if(shopInfo.size()==0){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    public String login(){
        shopUserPojo = new ShopUserPojo();
        shopUserPojo.setUsername(username);
        shopUserPojo.setPasswd(password);

        boolean result = shopService.login(shopUserPojo);
        if (result){
            ActionContext.getContext().getSession().put("user", shopUserPojo);
            ActionContext.getContext().getSession().put("type", UserType.Producer);
            return SUCCESS;
        }else {
            addActionError("商家登陆失败");
            return ERROR;
        }

    }
    public String logout(){
        ActionContext.getContext().getSession().put("type", UserType.Reader);
        return SUCCESS;
    }
    public String addShopInfo(){
        boolean result = shopService.addShopInfo(shopInfoPojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("添加商家信息失败");
            return ERROR;
        }
    }
    public String updateShopInfo(){
        boolean result = shopService.updateShopInfo(shopInfoPojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("更新商家信息失败");
            return ERROR;
        }
    }
    public String deleteShopInfo(){
        boolean result = shopService.deleteShopInfo(shopInfoPojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("删除商家信息失败");
            return ERROR;
        }
    }
    public String addShopUser(){
        boolean result = shopService.addShopUser(shopUserPojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("添加商家用户失败");
            return ERROR;
        }
    }
    public String updateShopUser(){
        boolean result = shopService.updateShopUser(shopUserPojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("更新商家用户失败");
            return ERROR;
        }
    }
    public String deleteShopUser(){
        boolean result = shopService.deleteShopUser(shopUserPojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("删除商家用户失败");
            return ERROR;
        }
    }

    public ShopInfoPojo getShopInfoPojo() {
        return shopInfoPojo;
    }

    public void setShopInfoPojo(ShopInfoPojo shopInfoPojo) {
        this.shopInfoPojo = shopInfoPojo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ShopUserPojo getShopUserPojo() {

        return shopUserPojo;
    }

    public void setShopUserPojo(ShopUserPojo shopUserPojo) {
        this.shopUserPojo = shopUserPojo;
    }

    public ShopService getShopService() {
        return shopService;
    }

    public void setShopService(ShopService shopService) {
        this.shopService = shopService;
    }
}
