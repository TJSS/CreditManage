package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.OrderListPojo;

import java.sql.Timestamp;
import java.util.List;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface OrderListDao {

	public OrderListPojo findById(Integer id);

	public List<OrderListPojo> findAll();

	public Integer save(OrderListPojo orderlist);

	public void delete(OrderListPojo orderlist);

	public void update(OrderListPojo orderlist);

	public List<OrderListPojo> findByOrderlistid(String orderlistid);

	public List<OrderListPojo> findByPaserviceid(String paserviceid);

	public List<OrderListPojo> findByUsername(String username);

	public List<OrderListPojo> findByOrdertime(Timestamp ordertime);

	public List<OrderListPojo> findByStatus(String status);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
