package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.dao.OrderListDao;
import com.pingancar.creditmanage.service.OrderListService;
import com.pingancar.creditmanage.util.myenum.OrderListField;
import com.pingancar.creditmanage.pojo.OrderListPojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */

/**
 * 要改要改！！！！！！？？？？？？
 * 增加存在感
 */
public class OrderListServiceImpl implements OrderListService {

    OrderListDao orderListDao;

    @Override
    public List<OrderListPojo> queryOrderList(List<OrderListField> orderListFieldList, List<String> valueList) {

              //这个搞不太懂。。。。。。。
             return  orderListDao.findBySqlSentence(orderListFieldList.toString(),valueList);
    }

    @Override
    public boolean addOrderList(OrderListPojo orderListPojo) {
        return false;
        //return orderListDao.save(orderListPojo);
    }

    @Override
    public boolean updateOrderList(OrderListPojo orderListPojo) {
        //好像都没有返回值？？？？
        orderListDao.update(orderListPojo);
        return false;
    }

    @Override
    public boolean deleteOrderList(OrderListPojo orderListPojo) {
        //好像都没有返回值？？？？
        orderListDao.delete(orderListPojo);
        return false;
    }
}
