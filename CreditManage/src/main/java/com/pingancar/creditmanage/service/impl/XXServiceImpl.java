package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.XXDao;
import com.pingancar.creditmanage.service.XXService;

/**
 * Created by Administrator on 2014/9/3 0003.
 */
public class XXServiceImpl implements XXService {
    private XXDao xxDao;

    public XXDao getXxDao() {
        return xxDao;
    }

    public void setXxDao(XXDao xxDao) {
        this.xxDao = xxDao;
    }
}
