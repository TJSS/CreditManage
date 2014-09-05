package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.UserPojo;
import com.pingancar.creditmanage.util.myenum.UserField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/3 0003.
 */
public interface UserDao {
    /**
     * 更新用户信息
     * @param userPojo
     * @return 是否更新成功
     */
    public boolean updateUser(UserPojo userPojo);

    /**
     * 查询用户
     * @param userFieldList
     * @param valueList
     * @return
     */
    public List<UserPojo> queryUser(List<UserField> userFieldList, List<String> valueList);


}
