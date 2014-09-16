package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.CreditPojo;
import com.pingancar.creditmanage.service.CreditService;

import java.util.List;

/**
 * Created by kx on 2014/9/12.
 */
public class CreditAction extends ActionSupport{
    private CreditService creditService;
    private CreditPojo creditPojo;
    private String creditByUsernameId;



    public String queryCreditByUsername(){
        List<CreditPojo> creditByUsername = creditService.queryCreditByUsername(creditByUsernameId);
        ActionContext.getContext().getSession().put("creditByUsername", creditByUsername);
        if(creditByUsername.size()==0){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    public String updateCredit(){
        boolean result=    creditService.updateCredit(creditPojo);
        if(result){
            return SUCCESS;
        }else{
            addActionError("更新积分错误");
            return ERROR;
        }
    }
    public CreditService getCreditService() {
        return creditService;
    }

    public void setCreditService(CreditService creditService) {
        this.creditService = creditService;
    }
    public String getCreditByUsernameId() {
        return creditByUsernameId;
    }

    public void setCreditByUsernameId(String creditByUsernameId) {
        this.creditByUsernameId = creditByUsernameId;
    }

    public CreditPojo getCreditPojo() {

        return creditPojo;
    }

    public void setCreditPojo(CreditPojo creditPojo) {
        this.creditPojo = creditPojo;
    }
}
