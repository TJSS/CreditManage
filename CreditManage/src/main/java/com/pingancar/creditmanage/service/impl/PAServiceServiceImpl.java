package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.PAServiceInfoDao;
import com.pingancar.creditmanage.pojo.PAServiceInfoPojo;
import com.pingancar.creditmanage.service.PAServiceInfoService;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class PAServiceServiceImpl implements PAServiceInfoService {
    PAServiceInfoDao paServiceInfoDao;
    @Override
    public List<PAServiceInfoPojo> queryPAServiceInfo(String paServiceInfoId) {
        return paServiceInfoDao.findByPaserviceinfoid(Integer.getInteger(paServiceInfoId));
    }

    @Override
    public boolean addPAServiceInfo(PAServiceInfoPojo paServiceInfoPojo) {
        return false;
        //return  paServiceInfoDao.save(paServiceInfoPojo);
    }

    @Override
    public boolean updatePAServiceInfo(PAServiceInfoPojo paServiceInfoPojo) {
        //还是木有什么要返回的
        paServiceInfoDao.update(paServiceInfoPojo);
        return false;
    }

    @Override
    public boolean deletePAServiceInfo(PAServiceInfoPojo paServiceInfoPojo) {
        //问题同上
        paServiceInfoDao.delete(paServiceInfoPojo);
        return false;
    }
}
