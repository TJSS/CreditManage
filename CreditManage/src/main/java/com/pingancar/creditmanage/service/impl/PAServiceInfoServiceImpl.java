package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.PAServiceInfoDao;
import com.pingancar.creditmanage.pojo.PAServiceInfoPojo;
import com.pingancar.creditmanage.service.PAServiceInfoService;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class PAServiceInfoServiceImpl implements PAServiceInfoService {
    PAServiceInfoDao paServiceInfoDao;
    @Override
    public List<PAServiceInfoPojo> queryPAServiceInfo(String paServiceInfoId) {
        return paServiceInfoDao.findByPaserviceinfoid(Integer.getInteger(paServiceInfoId));

    }

    @Override
    public boolean addPAServiceInfo(PAServiceInfoPojo paServiceInfoPojo) {

        paServiceInfoDao.save(paServiceInfoPojo);
        return true;
    }

    @Override
    public boolean updatePAServiceInfo(PAServiceInfoPojo paServiceInfoPojo) {
        //返回值
        paServiceInfoDao.update(paServiceInfoPojo);
        return true;
    }

    @Override
    public boolean deletePAServiceInfo(PAServiceInfoPojo paServiceInfoPojo) {
        //返回值
        paServiceInfoDao.delete(paServiceInfoPojo);
        return true;
    }

    public PAServiceInfoDao getPaServiceInfoDao() {
        return paServiceInfoDao;
    }

    public void setPaServiceInfoDao(PAServiceInfoDao paServiceInfoDao) {
        this.paServiceInfoDao = paServiceInfoDao;
    }
}
