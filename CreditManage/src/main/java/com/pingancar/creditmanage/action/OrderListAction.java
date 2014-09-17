package com.pingancar.creditmanage.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pingancar.creditmanage.pojo.OrderListPojo;
import com.pingancar.creditmanage.pojo.OrderListPojo;
import com.pingancar.creditmanage.service.OrderListService;
import com.pingancar.creditmanage.util.myenum.OrderListField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kx on 2014/9/12.
 */
public class OrderListAction extends ActionSupport{
    private OrderListService orderListService;
    private OrderListPojo orderlistPojo;
    private String searchorderlistid;
    private String searchpaderviceid;
    private String searchusername;
    private String searchstatus;
    private List<OrderListField> orderListFieldList;
    private  List<String> valueList;

    public String queryOrderList (){
        orderListFieldList = new ArrayList<OrderListField>();
        valueList = new ArrayList<String>();
        valueList = new ArrayList<String>();
        if(searchorderlistid !=null && searchorderlistid.length() != 0){
            orderListFieldList.add(OrderListField.ORDERLISTID);
            valueList.add(searchorderlistid);
        }

        if(searchpaderviceid !=null && searchpaderviceid.length() != 0){
            orderListFieldList.add(OrderListField.PASERVICEID);
            valueList.add(searchpaderviceid);
        }

        if(searchusername !=null && searchusername.length() != 0){
            orderListFieldList.add(OrderListField.USERNAME);
            valueList.add(searchusername);
        }

        if(searchstatus!=null && searchstatus.length() != 0){
            orderListFieldList.add(OrderListField.STATUS);
            valueList.add(searchstatus);
        }


        List<OrderListPojo> getOrderList= orderListService.queryOrderList( orderListFieldList,  valueList);
        if(getOrderList.size()!=0){
            ActionContext.getContext().getSession().put("orderlist", getOrderList);
            return SUCCESS;
        }else {
            return ERROR;
        }
    }




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

    public String getSearchorderlistid() {
        return searchorderlistid;
    }

    public void setSearchorderlistid(String searchorderlistid) {
        this.searchorderlistid = searchorderlistid;
    }

    public String getSearchpaderviceid() {
        return searchpaderviceid;
    }

    public void setSearchpaderviceid(String searchpaderviceid) {
        this.searchpaderviceid = searchpaderviceid;
    }

    public String getSearchusername() {
        return searchusername;
    }

    public void setSearchusername(String searchusername) {
        this.searchusername = searchusername;
    }

    public String getSearchstatus() {
        return searchstatus;
    }

    public void setSearchstatus(String searchstatus) {
        this.searchstatus = searchstatus;
    }

    public List<OrderListField> getOrderListFieldList() {
        return orderListFieldList;
    }

    public void setOrderListFieldList(List<OrderListField> orderListFieldList) {
        this.orderListFieldList = orderListFieldList;
    }

    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }
}
