package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.PAServiceDao;
import com.pingancar.creditmanage.dao.PAServiceInfoDao;
import com.pingancar.creditmanage.pojo.PAServiceInfoPojo;
import com.pingancar.creditmanage.pojo.PAServicePojo;
import com.pingancar.creditmanage.service.PAServiceInfoService;
import com.pingancar.creditmanage.service.PAServiceService;
import com.pingancar.creditmanage.util.myenum.PAServiceField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class PAServiceServiceImpl implements PAServiceService {
    PAServiceDao paServiceDao;

    @Override
    public List<String> getAllTags(String paserviceinfoid) {
        return null;
    }

    @Override
    public List<PAServicePojo> queryPAService(List<PAServiceField> paServiceFieldList, List<String> valueList) {
        return paServiceDao.queryPAService(paServiceFieldList,valueList);
    }

    @Override
    public boolean addPAService(PAServicePojo paServicePojo) {
        List<PAServicePojo> result=paServiceDao.findByPaserviceid(paServicePojo.getPaserviceinfoid());
        if(result == null){
            result=new ArrayList<PAServicePojo>();
        }
        if(!(result.size()>0)){
            return false;

        }
        paServiceDao.save(paServicePojo);
        return true;
    }

    @Override
    public boolean updatePAService(PAServicePojo paServicePojo) {
        List<PAServicePojo> result=paServiceDao.findByPaserviceid(paServicePojo.getPaserviceid());
        if(result == null){
            return false;
        }
        if(result.size()<1){
            return false;
        }
        PAServicePojo re=result.get(0);
        if(!"".equals(paServicePojo.getTag1())){
            re.setTag1(paServicePojo.getTag1());
        }
        if(!"".equals(paServicePojo.getType())){
            re.setType(paServicePojo.getType());
        }
        if(!"".equals(paServicePojo.getCreditcost())) {
            re.setCreditcost(paServicePojo.getCreditcost());
        }
        if(!"".equals(paServicePojo.getAmount())) {
            re.setAmount(paServicePojo.getAmount());
        }
        if(!"".equals(paServicePojo.getLeftnum())) {
            re.setLeftnum(paServicePojo.getLeftnum());
        }
        paServiceDao.update(re);
        return true;
    }

    @Override
    public boolean deletePAService(PAServicePojo paServicePojo) {
        List<PAServicePojo> result=paServiceDao.findByPaserviceid(paServicePojo.getPaserviceid());
        if(result == null){
            return false;
        }
        if(result.size()<1){
            return false;
        }
        PAServicePojo re=result.get(0);
        paServiceDao.delete(re);
        return true;
    }

    public PAServiceDao getPaServiceDao() {
        return paServiceDao;
    }

    public void setPaServiceDao(PAServiceDao paServiceDao) {
        this.paServiceDao = paServiceDao;
    }
}
