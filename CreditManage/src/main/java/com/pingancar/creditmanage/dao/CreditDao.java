package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.CreditPojo;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public interface CreditDao {
    /**
     * 获取服务信息
     * @param username
     * @return
     */
    public List<CreditPojo> queryCreditByUsername(String username);

    /**
     * 更新积分
     * @param creditPojo
     * @return
     */
    public boolean updateCredit(CreditPojo creditPojo);
}
