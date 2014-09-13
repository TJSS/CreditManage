package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.ShopInfoPojo;
import com.pingancar.creditmanage.pojo.ShopUserPojo;
import com.pingancar.creditmanage.service.ShopService;

/**
 * Created by kx on 2014/9/13
 */
public class ShopAction extends ActionSupport{
    private ShopService shopService;
    private ShopInfoPojo shopInfoPojo;
    private ShopUserPojo shopUserPojo;
    public String login(){
        boolean result = shopService.login(shopUserPojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("商家登陆失败");
            return ERROR;
        }

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

    public ShopService getShopService() {
        return shopService;
    }

    public void setShopService(ShopService shopService) {
        this.shopService = shopService;
    }
}
