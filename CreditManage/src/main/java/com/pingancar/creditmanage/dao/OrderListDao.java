package com.pingancar.creditmanage.dao;

import org.tju.scs.damai.innovationFund.pojo.OrderlistPojo;
import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface OrderlistDao {

	public OrderlistPojo findById(Integer id);

	public List<OrderlistPojo> findAll();

	public Integer save(OrderlistPojo orderlist);

	public void delete(OrderlistPojo orderlist);

	public void update(OrderlistPojo orderlist);

	public List<OrderlistPojo> findByOrderlistid(String orderlistid);

	public List<OrderlistPojo> findByPaserviceid(String paserviceid);

	public List<OrderlistPojo> findByUsername(String username);

	public List<OrderlistPojo> findByOrdertime(Timestamp ordertime);

	public List<OrderlistPojo> findByStatus(String status);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
