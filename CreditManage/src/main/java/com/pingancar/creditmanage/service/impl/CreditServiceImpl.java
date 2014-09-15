package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.CreditDao;
import com.pingancar.creditmanage.pojo.CreditPojo;
import com.pingancar.creditmanage.service.CreditService;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class CreditServiceImpl implements CreditService {
    CreditDao creditDao;
    @Override
    public List<CreditPojo> queryCreditByUsername(String username) {
       if(checkUsername(username)) {
           return creditDao.findByUsername(username);
       }
        return new ArrayList<CreditPojo>();

    }

    @Override
    public boolean updateCredit(CreditPojo creditPojo) {
        if(checkUsername(creditPojo.getUsername())){
            List<CreditPojo> result=creditDao.findByUsername(creditPojo.getUsername());
            CreditPojo re =result.get(0);
            re.setCredit(creditPojo.getCredit());
            creditDao.update(re);
            return true;
        }
        return false;
    }

    //检验username合法性
    private boolean checkUsername(String username){
        //用户名不能小于4位
        if(username.length()<4){
            return false;
        }
        //检验是否存在非法字符
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        if(p.matcher(username).find()){
            return false;
        }
        return true;
    }

    public CreditDao getCreditDao() {
        return creditDao;
    }

    public void setCreditDao(CreditDao creditDao) {
        this.creditDao = creditDao;
    }
}
