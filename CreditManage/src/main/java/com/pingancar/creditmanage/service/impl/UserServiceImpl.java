package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.UserDao;
import com.pingancar.creditmanage.pojo.UserPojo;
import com.pingancar.creditmanage.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class UserServiceImpl implements UserService {

    UserDao userDao;
    @Override
    public boolean registerUser(UserPojo userPojo) {
        if(!checkUser(userPojo)){
            return false;
        }
        List<UserPojo> result1= userDao.findByUsername(userPojo.getUsername());
        List<UserPojo> result2= userDao.findByCarnumber(userPojo.getCarnumber());
        if(result1 == null){
            result1 = new ArrayList<UserPojo>();
        }
        if(result2 == null){
            result2 = new ArrayList<UserPojo>();
        }
        //判断该车是否投保
        if(result2.size()<1){
            return false;
        }
        //判断用户名是否已用
        if(result1.size()>0){
            return false;
        }
        //判断车牌是否被注册
        if(!("".equals(result2.get(0).getUsername())|| result2.get(0).getUsername() == null)){
            return false;
        }

        UserPojo re=result2.get(0) ;
        re.setUsername(userPojo.getUsername());
        re.setPasswd(userPojo.getPasswd());
        re.setCon(userPojo.getCon());
        re.setEmail(userPojo.getEmail());
        re.setRegtime(userPojo.getRegtime());
        userDao.add(re);
        return true;
    }

    @Override
    public boolean login(UserPojo userPojo) {
      if(checkUser(userPojo)){
          List<UserPojo> result= userDao.findByUsername(userPojo.getUsername());
          if(result == null){
              return false;
          }
          if(result.size()>0){
              if(result.get(0).getPasswd().equals(userPojo.getPasswd())){
                  return true;
              }
          }
      }
        return false;
    }

    @Override
    public boolean updateUser(UserPojo userPojo) {
        //木有返回值怎么搞？？

        UserPojo result=userDao.findById(userPojo.getId());

        result.setUsername(userPojo.getUsername());
        result.setPasswd(userPojo.getPasswd());
        result.setCon(userPojo.getCon());
        result.setEmail(userPojo.getEmail());
        result.setRegtime(userPojo.getRegtime());
        result.setCarnumber(userPojo.getCarnumber());
        result.setCartype(userPojo.getCartype());
        result.setCarowner(userPojo.getCarowner());
        result.setEndtime(userPojo.getEndtime());
        result.setMobilephone(userPojo.getMobilephone());
        result.setStarttime(userPojo.getStarttime());
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

        return true;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
