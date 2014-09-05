package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.PAServiceInfoPojo;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public interface PAServiceInfoDao {
    /**
     * 获取服务信息
     * @param paServiceInfoId
     * @return
     */
    public List<PAServiceInfoPojo> queryPAServiceInfo(String paServiceInfoId);

    /**
     * 添加服务信息
     * @param paServiceInfoPojo
     * @return
     */
    public boolean addPAServiceInfo(PAServiceInfoPojo paServiceInfoPojo);

    /**
     * 更新服务信息
     * @param paServiceInfoPojo
     * @return
     */
    public boolean updatePAServiceInfo(PAServiceInfoPojo paServiceInfoPojo);

    /**
     * 删除服务信息
     * @param paServiceInfoPojo
     * @return
     */
    public boolean deletePAServiceInfo(PAServiceInfoPojo paServiceInfoPojo);
}
