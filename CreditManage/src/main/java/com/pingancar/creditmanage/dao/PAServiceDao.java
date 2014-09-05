package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.PAServicePojo;
import com.pingancar.creditmanage.util.myenum.PAServiceField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public interface PAServiceDao {
    /**
     * 获取服务信息
     * @param paServiceFieldList
     * @param valueList
     * @return
     */
    public List<PAServicePojo> queryPAService(List<PAServiceField> paServiceFieldList, List<String> valueList);

    /**
     * 添加服务
     * @param paServicePojo
     * @return
     */
    public boolean addPAService(PAServicePojo paServicePojo);

    /**
     * 更新服务
     * @param paServicePojo
     * @return
     */
    public boolean updatePAService(PAServicePojo paServicePojo);

    /**
     * 删除服务
     * @param paServicePojo
     * @return
     */
    public boolean deletePAService(PAServicePojo paServicePojo);
}
