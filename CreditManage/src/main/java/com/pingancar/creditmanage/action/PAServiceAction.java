package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.PAServicePojo;
import com.pingancar.creditmanage.service.PAServiceService;
import java.util.List;
import com.pingancar.creditmanage.util.myenum.PAServiceField;
/**
 * Created by kx on 2014/9/12.
 */
public class PAServiceAction extends ActionSupport{
    private PAServiceService paServiceService;
    private PAServicePojo paServicePojo;
    private List<PAServiceField> paServiceFieldList;


    private List<String> valueList;

    public String queryPAService(){
        List<PAServicePojo> getservice=paServiceService.queryPAService(paServiceFieldList,valueList);
        ActionContext.getContext().getSession().put("service", getservice);
        if(getservice.size()==0){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

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
