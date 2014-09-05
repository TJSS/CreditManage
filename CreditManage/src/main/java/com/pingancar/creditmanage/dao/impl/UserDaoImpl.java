package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.UserDao;
import com.pingancar.creditmanage.pojo.UserPojo;
import com.pingancar.creditmanage.util.myenum.UserField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean updateUser(UserPojo userPojo) {
        return false;
    }

    @Override
    public List<UserPojo> queryUser(List<UserField> userFieldList, List<String> valueList) {
        return null;
    }
}
