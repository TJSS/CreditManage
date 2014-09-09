package com.pingancar.creditmanage.dao.impl;

import org.tju.scs.damai.innovationFund.pojo.OrderlistPojo;
import org.tju.scs.damai.innovationFund.dao.OrderlistDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class OrderlistDaoImpl implements OrderlistDao {

	SessionFactory sessionFactory;
	HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public HibernateTemplate getHibernateTemplate() {
		if (null == hibernateTemplate) {
			hibernateTemplate = new HibernateTemplate(sessionFactory);
		}
		return hibernateTemplate;
	}

	public OrderlistPojo findById(Integer id){
		return (OrderlistPojo)getHibernateTemplate().get(OrderlistPojo.class, id);
	}

	public List<OrderlistPojo> findAll(){
		String query = "from OrderlistPojo";
		return (List<OrderlistPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(OrderlistPojo orderlist){
		return (Integer)getHibernateTemplate().save(orderlist);
	}

	public void delete(OrderlistPojo orderlist){
		getHibernateTemplate().delete(orderlist);
	}

	public void update(OrderlistPojo orderlist){

		getHibernateTemplate().update(orderlist);
	}

	public List<OrderlistPojo> findByOrderlistid(String orderlistid){
		String query = "from OrderlistPojo temp where temp.orderlistid = ?";
		return (List<OrderlistPojo>)(getHibernateTemplate().find(query, orderlistid));
	}

	public List<OrderlistPojo> findByPaserviceid(String paserviceid){
		String query = "from OrderlistPojo temp where temp.paserviceid = ?";
		return (List<OrderlistPojo>)(getHibernateTemplate().find(query, paserviceid));
	}

	public List<OrderlistPojo> findByUsername(String username){
		String query = "from OrderlistPojo temp where temp.username = ?";
		return (List<OrderlistPojo>)(getHibernateTemplate().find(query, username));
	}

	public List<OrderlistPojo> findByOrdertime(Timestamp ordertime){
		String query = "from OrderlistPojo temp where temp.ordertime = ?";
		return (List<OrderlistPojo>)(getHibernateTemplate().find(query, ordertime));
	}

	public List<OrderlistPojo> findByStatus(String status){
		String query = "from OrderlistPojo temp where temp.status = ?";
		return (List<OrderlistPojo>)(getHibernateTemplate().find(query, status));
	}

	public List findBySqlSentence(String queryString){
		return getHibernateTemplate().find(queryString);
	}
	public List findBySqlSentence(String queryString, Object value){
		return getHibernateTemplate().find(queryString, value);
	}

	public List findBySqlSentence(String queryString, Object... values){
		return getHibernateTemplate().find(queryString, values);
	}

}