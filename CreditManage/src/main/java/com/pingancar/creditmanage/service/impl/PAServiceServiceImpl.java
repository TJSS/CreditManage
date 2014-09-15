package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.PAServiceDao;
import com.pingancar.creditmanage.dao.PAServiceInfoDao;
import com.pingancar.creditmanage.pojo.PAServiceInfoPojo;
import com.pingancar.creditmanage.pojo.PAServicePojo;
import com.pingancar.creditmanage.service.PAServiceInfoService;
import com.pingancar.creditmanage.service.PAServiceService;
import com.pingancar.creditmanage.util.myenum.PAServiceField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class PAServiceServiceImpl implements PAServiceService {
    PAServiceDao paServiceDao;
    @Override
    public List<PAServicePojo> queryPAService(List<PAServiceField> paServiceFieldList, List<String> valueList) {
        return null;
    }

    @Override
    public boolean addPAService(PAServicePojo paServicePojo) {

        paServiceDao.save(paServicePojo);
        return true;
    }

    @Override
    public boolean updatePAService(PAServicePojo paServicePojo) {
        paServiceDao.update(paServicePojo);
        return true;
    }

    @Override
    public boolean deletePAService(PAServicePojo paServicePojo) {
        paServiceDao.delete(paServicePojo);
        return true;
    }

    public PAServiceDao getPaServiceDao() {
        return paServiceDao;
    }

    public void setPaServiceDao(PAServiceDao paServiceDao) {
        this.paServiceDao = paServiceDao;
    }
}
