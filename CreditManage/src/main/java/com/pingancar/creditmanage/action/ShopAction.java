package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.ShopInfoPojo;
import com.pingancar.creditmanage.pojo.ShopUserPojo;
import com.pingancar.creditmanage.service.ShopService;
import com.pingancar.creditmanage.util.myenum.ShopInfoField;
import com.pingancar.creditmanage.util.myenum.UserType;

import java.util.ArrayList;
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
    private List<String> allTag;
    private  String shopid;
    private String paserviceinfoid;
    private String tag1;



    public String getAllTags(){
        //shopService
        allTag = shopService.getAllTags(paserviceinfoid);
        if(allTag.size()!=0){
            ActionContext.getContext().getSession().put("paserviceinfoid",paserviceinfoid);
            ActionContext.getContext().getSession().put("allshoptags",allTag);
            return SUCCESS;
        }else{
            return ERROR;
        }


    }

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
        shopInfoFields = new ArrayList<ShopInfoField>();
        valueList = new ArrayList<String>();
        if(shopid !=null && shopid.length() != 0){
            shopInfoFields.add(ShopInfoField.SHOPID);
            valueList.add(shopid);

        }

        if(paserviceinfoid !=null && paserviceinfoid.length() != 0){
            shopInfoFields.add(ShopInfoField.PASERVICEINFOID);
            valueList.add(paserviceinfoid);

        }

        if(tag1 !=null && tag1.length() != 0){
            shopInfoFields.add(ShopInfoField.TAG1);
            valueList.add(tag1);

        }

        List<ShopInfoPojo> getshopInfoList = shopService.queryShopInfo(shopInfoFields,valueList);
        if(getshopInfoList.size()!=0){
            ActionContext.getContext().getSession().put("shopinfolist",getshopInfoList);
            return SUCCESS;
        }else {
            return ERROR;
        }


    }

    public List<String> getAllTag() {
        return allTag;
    }

    public void setAllTag(List<String> allTag) {
        this.allTag = allTag;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getPaserviceinfoid() {
        return paserviceinfoid;
    }

    public void setPaserviceinfoid(String paserviceinfoid) {
        this.paserviceinfoid = paserviceinfoid;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
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
