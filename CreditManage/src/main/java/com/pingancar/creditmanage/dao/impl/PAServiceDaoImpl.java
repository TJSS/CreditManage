package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.PAServiceDao;
import com.pingancar.creditmanage.pojo.PAServicePojo;
import com.pingancar.creditmanage.util.myenum.PAServiceField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class PAServiceDaoImpl implements PAServiceDao {
    @Override
    public List<PAServicePojo> queryPAService(List<PAServiceField> paServiceFieldList, List<String> valueList) {
        return null;
    }

    @Override
    public boolean addPAService(PAServicePojo paServicePojo) {
        return false;
    }

    @Override
    public boolean updatePAService(PAServicePojo paServicePojo) {
        return false;
    }

    @Override
    public boolean deletePAService(PAServicePojo paServicePojo) {
        return false;
    }
}
