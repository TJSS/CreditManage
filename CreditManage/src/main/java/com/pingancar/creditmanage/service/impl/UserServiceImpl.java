package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.UserDao;
import com.pingancar.creditmanage.pojo.UserPojo;
import com.pingancar.creditmanage.service.UserService;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class UserServiceImpl implements UserService {

    UserDao userDao;
    @Override
    public boolean registerUser(UserPojo userPojo) {
        if(checkUser(userPojo)){
            return false;
        }
        List<UserPojo> result1= userDao.findByUsername(userPojo.getUsername());
        List<UserPojo> result2= userDao.findByCarnumber(userPojo.getCarnumber());
        if(result1.size()>0||result2.size()>0){
            return false;
        }
        return userDao.save(userPojo);
    }

    @Override
    public boolean login(UserPojo userPojo) {
      if(checkUser(userPojo)){
          List<UserPojo> result= userDao.findByUsername(userPojo.getUsername());
          if(result.size()>0){
              if(result.get(0).getPasswd()==userPojo.getPasswd()){
                  return true;
              }
          }
      }
        return false;
    }

    @Override
    public boolean updateUser(UserPojo userPojo) {
        //木有返回值怎么搞？？
        userDao.update(userPojo);
        return false;
    }

    private boolean checkUser(UserPojo userPojo){
        //密码不能小于6位
        if(userPojo.getPasswd().length()<6){
            return false;
        }
        //用户名不能小于4位
        if(userPojo.getUsername().length()<4){
            return false;
        }
        //检验是否存在非法字符

        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        if(p.matcher(userPojo.getPasswd()).find()||p.matcher(userPojo.getUsername()).find()){
            return false;
        }
    }
}
