package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.CreditPojo;
import com.pingancar.creditmanage.service.CreditService;

/**
 * Created by kx on 2014/9/12.
 */
public class CreditAction extends ActionSupport{
    private CreditService creditService;
    private CreditPojo creditPojo;

    public String updateCredit(CreditPojo creditPojo){
        boolean result= creditService.updateCredit(creditPojo);
        if(result){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
    public CreditService getCreditService() {
        return creditService;
    }

    public void setCreditService(CreditService creditService) {
        this.creditService = creditService;
    }
}
