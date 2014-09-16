package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.PAServiceInfoDao;
import com.pingancar.creditmanage.pojo.PAServiceInfoPojo;
import com.pingancar.creditmanage.service.PAServiceInfoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class PAServiceInfoServiceImpl implements PAServiceInfoService {
    PAServiceInfoDao paServiceInfoDao;
    @Override
    public List<PAServiceInfoPojo> queryPAServiceInfo(String paServiceInfoId) {
        List<PAServiceInfoPojo> result = paServiceInfoDao.findByPaserviceinfoid(Integer.parseInt(paServiceInfoId));
        if(result == null){
            result = new ArrayList<PAServiceInfoPojo>();
        }
        return result;

    }

    @Override
    public boolean addPAServiceInfo(PAServiceInfoPojo paServiceInfoPojo) {

        paServiceInfoDao.save(paServiceInfoPojo);
        return true;
    }

    @Override
    public boolean updatePAServiceInfo(PAServiceInfoPojo paServiceInfoPojo) {
        //返回值
        List<PAServiceInfoPojo> result= paServiceInfoDao.findByPaserviceinfoid(paServiceInfoPojo.getPaserviceinfoid());
        if(result == null){
            result = new ArrayList<PAServiceInfoPojo>();
        }
        if(result.size()<1){
            return false;
        }
        PAServiceInfoPojo re=result.get(0);
        if(!"".equals(paServiceInfoPojo.getImgurl())){
            re.setImgurl(paServiceInfoPojo.getImgurl());
        }

        if(!"".equals(paServiceInfoPojo.getTag1())) {
            re.setTag1(paServiceInfoPojo.getTag1());
        }
        if(!"".equals(paServiceInfoPojo.getTag2())){
            re.setTag2(paServiceInfoPojo.getTag2());
        }
        if(!"".equals(paServiceInfoPojo.getTag3())){
            re.setTag3(paServiceInfoPojo.getTag3());
        }
        if(!"".equals(paServiceInfoPojo.getTag4())){
            re.setTag4(paServiceInfoPojo.getTag4());
        }
        if(!"".equals(paServiceInfoPojo.getTag5())){
            re.setTag5(paServiceInfoPojo.getTag5());
        }
        if(!"".equals(paServiceInfoPojo.getServicestart())){
            re.setServicestart(paServiceInfoPojo.getServicestart());
        }
        if(!"".equals(paServiceInfoPojo.getServiceend())){
            re.setServiceend(paServiceInfoPojo.getServiceend());
        }
        paServiceInfoDao.update(re);
        return true;
    }

    @Override
    public boolean deletePAServiceInfo(PAServiceInfoPojo paServiceInfoPojo) {
        //返回值
        List<PAServiceInfoPojo> result= paServiceInfoDao.findByPaserviceinfoid(paServiceInfoPojo.getPaserviceinfoid());
        if(result.size()<1){
            paServiceInfoDao.delete(result.get(0));
        }
        return true;
    }

    public PAServiceInfoDao getPaServiceInfoDao() {
        return paServiceInfoDao;
    }

    public void setPaServiceInfoDao(PAServiceInfoDao paServiceInfoDao) {
        this.paServiceInfoDao = paServiceInfoDao;
    }
}
