package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.PAServicePojo;
import com.pingancar.creditmanage.service.PAServiceService;

/**
 * Created by kx on 2014/9/12.
 */
public class PAServiceAction extends ActionSupport{
    private PAServiceService paServiceService;
    private PAServicePojo paServicePojo;

    public String addPAService(){
        boolean result=paServiceService.addPAService(paServicePojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("添加服务失败");
            return ERROR;
        }
    }
    public String updatePAService(){
        boolean result=paServiceService.updatePAService(paServicePojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("更新服务失败");
            return ERROR;
        }
    }
    public String deletePAService(){
        boolean result = paServiceService.deletePAService(paServicePojo);
        if (result){
            return SUCCESS;
        }else {
            addActionError("删除商家失败");
            return ERROR;
        }
    }
    public PAServiceService getPaServiceService() {
        return paServiceService;
    }

    public void setPaServiceService(PAServiceService paServiceService) {
        this.paServiceService = paServiceService;
    }
}
