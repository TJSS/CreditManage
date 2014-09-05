package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.AdminPojo;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public interface AdminDao {
    /**
     * 获取管理员信息
     * @param username
     * @return
     */
    public List<AdminPojo> queryCreditByUsername(String username);
}
