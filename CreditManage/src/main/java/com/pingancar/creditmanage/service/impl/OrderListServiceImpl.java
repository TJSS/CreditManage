package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.pojo.OrderListPojo;
import com.pingancar.creditmanage.service.OrderListService;
import com.pingancar.creditmanage.util.myenum.OrderListField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class OrderListServiceImpl implements OrderListService {
    @Override
    public List<OrderListPojo> queryOrderList(List<OrderListField> orderListFieldList, List<String> valueList) {
        return null;
    }

    @Override
    public boolean addOrderList(OrderListPojo orderListPojo) {
        return false;
    }

    @Override
    public boolean updateOrderList(OrderListPojo orderListPojo) {
        return false;
    }

    @Override
    public boolean deleteOrderList(OrderListPojo orderListPojo) {
        return false;
    }
}
