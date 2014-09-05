package com.pingancar.creditmanage.service;

import com.pingancar.creditmanage.pojo.UserPojo;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public interface UserService {
    /**
     * 注册账户
     * @param userPojo
     * @return
     */
    public boolean registerUser(UserPojo userPojo);

    /**
     *登录
     * @param userPojo
     * @return
     */
    public boolean login(UserPojo userPojo);

    /**
     *更新用户信息
     * @param userPojo
     * @return
     */
    public boolean updateUser(UserPojo userPojo);
}
