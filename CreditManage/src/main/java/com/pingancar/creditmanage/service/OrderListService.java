package com.pingancar.creditmanage.service;

import com.pingancar.creditmanage.pojo.OrderListPojo;
import com.pingancar.creditmanage.util.myenum.OrderListField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public interface OrderListService {
    /**
     * 获取订单
     * @param orderListFieldList
     * @param valueList
     * @return
     */
    public List<OrderListPojo> queryOrderList(List<OrderListField> orderListFieldList, List<String> valueList);

    /**
     * 添加订单
     * @param orderListPojo
     * @return
     */
    public boolean addOrderList(OrderListPojo orderListPojo);

    /**
     * 更新订单
     * @param orderListPojo
     * @return
     */
    public boolean updateOrderList(OrderListPojo orderListPojo);

    /**
     * 删除订单
     * @param orderListPojo
     * @return
     */
    public boolean deleteOrderList(OrderListPojo orderListPojo);
}
