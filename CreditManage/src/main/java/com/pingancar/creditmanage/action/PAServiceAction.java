package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.PAServicePojo;
import com.pingancar.creditmanage.service.PAServiceService;

import java.util.ArrayList;
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
    private String searchpaserviceinfoid;
    private String  searchpaserviceid;
    private String searchtype;


    public String queryPAService(){
        paServiceFieldList = new ArrayList<PAServiceField>();
        valueList = new ArrayList<String>();
        if(searchpaserviceinfoid != null && searchpaserviceinfoid.length() != 0){
            paServiceFieldList.add(PAServiceField.PASERVICEINFOID);
            valueList.add(searchpaserviceinfoid);
            List<PAServicePojo> getservice = paServiceService.queryPAService(paServiceFieldList,valueList);

            if(getservice.size()!=0){
                ActionContext.getContext().getSession().put("service", getservice.get(0));
                return SUCCESS;
            }else {
                return ERROR;
            }
        }

        if(searchpaserviceid !=null && searchpaserviceid.length() != 0){
            paServiceFieldList.add(PAServiceField.PASERVICEID);
            valueList.add(searchpaserviceid);
            List<PAServicePojo> getservice = paServiceService.queryPAService(paServiceFieldList,valueList);

            if(getservice.size()!=0){
                ActionContext.getContext().getSession().put("service", getservice.get(0));
                return SUCCESS;
            }else {
                return ERROR;
            }
        }

        if(searchtype != null && searchtype.length() != 0){
            paServiceFieldList.add(PAServiceField.TYPE);
            valueList.add(searchtype);
            List<PAServicePojo> getservice = paServiceService.queryPAService(paServiceFieldList,valueList);

            if(getservice.size()!=0){
                ActionContext.getContext().getSession().put("service", getservice.get(0));
                return SUCCESS;
            }else {
                return ERROR;
            }
        }else{
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
    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }

    public List<PAServiceField> getPaServiceFieldList() {

        return paServiceFieldList;
    }

    public void setPaServiceFieldList(List<PAServiceField> paServiceFieldList) {
        this.paServiceFieldList = paServiceFieldList;
    }
    public PAServicePojo getPaServicePojo() {

        return paServicePojo;
    }

    public void setPaServicePojo(PAServicePojo paServicePojo) {
        this.paServicePojo = paServicePojo;
    }
}
