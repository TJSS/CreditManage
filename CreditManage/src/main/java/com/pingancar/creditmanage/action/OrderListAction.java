package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.OrderListPojo;
import com.pingancar.creditmanage.pojo.OrderListPojo;
import com.pingancar.creditmanage.service.OrderListService;

/**
 * Created by kx on 2014/9/12.
 */
public class OrderListAction extends ActionSupport{
    private OrderListService orderListService;
    private OrderListPojo orderlistPojo;
    public String addOrderList(){
        boolean result=orderListService.addOrderList(orderlistPojo);
        if(result){
            return SUCCESS;
        }else{
            addActionError("添加订单失败");
            return ERROR;
        }
    }
    public String updateOrderList(){
        boolean result=orderListService.updateOrderList(orderlistPojo);
        if(result){
            return SUCCESS;
        }else{
            addActionError("更新订单失败");
            return ERROR;
        }
    }



    public String deleteOrderList(){
        boolean result=orderListService.deleteOrderList(orderlistPojo);
        if(result){
            return SUCCESS;
        }else{
            addActionError("删除订单");
            return ERROR;
        }

    }
    public OrderListPojo getOrderlistPojo() {
        return orderlistPojo;
    }

    public void setOrderlistPojo(OrderListPojo orderlistPojo) {
        this.orderlistPojo = orderlistPojo;
    }

    public OrderListService getOrderListService() {
        return orderListService;
    }

    public void setOrderListService(OrderListService orderListService) {
        this.orderListService = orderListService;
    }
}
