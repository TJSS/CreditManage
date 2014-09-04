package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.service.XXService;

/**
 * Created by Administrator on 2014/9/3 0003.
 */
public class XXAction extends ActionSupport{
    private XXService xxService;

    public XXService getXxService() {
        return xxService;
    }

    public void setXxService(XXService xxService) {
        this.xxService = xxService;
    }
}
