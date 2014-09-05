package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.CreditDao;
import com.pingancar.creditmanage.pojo.CreditPojo;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class CreditDaoImpl implements CreditDao{
    @Override
    public List<CreditPojo> queryCreditByUsername(String username) {
        return null;
    }

    @Override
    public boolean updateCredit(CreditPojo creditPojo) {
        return false;
    }
}
