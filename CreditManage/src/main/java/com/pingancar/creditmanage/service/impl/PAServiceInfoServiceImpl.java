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
        List<PAServiceInfoPojo> result= paServiceInfoDao.findByPaserviceinfoid(paServiceInfoPojo.getPaserviceinfoid());
        if(result.size()<1){
            return false;
        }
        PAServiceInfoPojo re=result.get(0);
        if(paServiceInfoPojo.getImgurl().equals("")){
            re.setImgurl(paServiceInfoPojo.getImgurl());
        }

        if(paServiceInfoPojo.getTag1().equals("")) {
            re.setTag1(paServiceInfoPojo.getTag1());
        }
        if(paServiceInfoPojo.getTag2().equals("")){
            re.setTag2(paServiceInfoPojo.getTag2());
        }
        if(paServiceInfoPojo.getTag3().equals("")){
            re.setTag3(paServiceInfoPojo.getTag3());
        }
        if(paServiceInfoPojo.getTag4().equals("")){
            re.setTag4(paServiceInfoPojo.getTag4());
        }
        if(paServiceInfoPojo.getTag5().equals("")){
            re.setTag5(paServiceInfoPojo.getTag5());
        }
        if(paServiceInfoPojo.getServicestart().equals("")){
            re.setServicestart(paServiceInfoPojo.getServicestart());
        }
        if(paServiceInfoPojo.getServiceend().equals("")){
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
