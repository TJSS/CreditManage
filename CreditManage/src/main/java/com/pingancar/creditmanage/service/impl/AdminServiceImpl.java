package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.AdminDao;
import com.pingancar.creditmanage.pojo.AdminPojo;
import com.pingancar.creditmanage.service.AdminService;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class AdminServiceImpl implements AdminService {
    private AdminDao adminDao;
    @Override
    public boolean login(AdminPojo adminPojo) {
        //密码不能小于6位
        if(adminPojo.getPasswd().length()<6){
            return false;
        }
        //用户名不能小于4位
        if(adminPojo.getUsername().length()<4){
            return false;
        }
        //检验是否存在非法字符

        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        if(p.matcher(adminPojo.getPasswd()).find()||p.matcher(adminPojo.getUsername()).find()){
            return false;
        }
        List<AdminPojo> result=adminDao.findByUsername(adminPojo.getUsername());
        if(result.size()>0){
            if(result.get(0).getPasswd()==adminPojo.getPasswd()){
                return true;
            }
        }
        return false;
    }

}

