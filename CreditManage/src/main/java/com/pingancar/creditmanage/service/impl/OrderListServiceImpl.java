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
       return  orderListDao.queryOrderList(orderListFieldList, valueList);

    }

    @Override
    public boolean addOrderList(OrderListPojo orderListPojo) {
        orderListDao.save(orderListPojo);
        return true;
    }

    @Override
    public boolean updateOrderList(OrderListPojo orderListPojo) {
        //好像都没有返回值？？？？
        List<OrderListPojo> result=orderListDao.findByOrderlistid(orderListPojo.getOrderlistid());
        if(result == null){
            return false;
        }
        if(result.size()<1){
            return false;
        }
        OrderListPojo re=result.get(0);
        if(!"".equals(orderListPojo.getStatus())){
            re.setStatus(orderListPojo.getStatus());
        }if(!"".equals(orderListPojo.getUsername())){
            re.setOrderlistid(orderListPojo.getUsername());
        }if(!"".equals(orderListPojo.getOrdertime())){
            re.setOrdertime(orderListPojo.getOrdertime());
        }if(!"".equals(orderListPojo.getPaserviceid())){
            re.setPaserviceid(orderListPojo.getPaserviceid());
        }
        if(!"".equals(orderListPojo.getOrderlistid())){
            re.setOrderlistid(orderListPojo.getOrderlistid());
        }
        orderListDao.update(re);
        return true;
    }

    @Override
    public boolean deleteOrderList(OrderListPojo orderListPojo) {
        List<OrderListPojo> result=orderListDao.findByOrderlistid(orderListPojo.getOrderlistid());
        if(result == null){
           return false;
        }
        if(result.size()<1){
            return false;
        }
        //好像都没有返回值？？？？
        orderListDao.delete(result.get(0));
        return true;
    }

    public OrderListDao getOrderListDao() {
        return orderListDao;
    }

    public void setOrderListDao(OrderListDao orderListDao) {
        this.orderListDao = orderListDao;
    }
}
