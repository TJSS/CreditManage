package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.PAServiceDao;
import com.pingancar.creditmanage.pojo.PAServicePojo;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class PAServiceDaoImpl implements PAServiceDao {

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

	public PAServicePojo findById(Integer id){
		return (PAServicePojo)getHibernateTemplate().get(PAServicePojo.class, id);
	}

	public List<PAServicePojo> findAll(){
		String query = "from PAService";
		return (List<PAServicePojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(PAServicePojo paservice){
		return (Integer)getHibernateTemplate().save(paservice);
	}

	public void delete(PAServicePojo paservice){
		getHibernateTemplate().delete(paservice);
	}

	public void update(PAServicePojo paservice){

		getHibernateTemplate().update(paservice);
	}

	public List<PAServicePojo> findByPaserviceinfoid(String paserviceinfoid){
		String query = "from PAService temp where temp.paserviceinfoid = ?";
		return (List<PAServicePojo>)(getHibernateTemplate().find(query, paserviceinfoid));
	}

	public List<PAServicePojo> findByPaserviceid(String paserviceid){
		String query = "from PAService temp where temp.paserviceid = ?";
		return (List<PAServicePojo>)(getHibernateTemplate().find(query, paserviceid));
	}

	public List<PAServicePojo> findByType(String type){
		String query = "from PAService temp where temp.type = ?";
		return (List<PAServicePojo>)(getHibernateTemplate().find(query, type));
	}

	public List<PAServicePojo> findByTag1(String tag1){
		String query = "from PAService temp where temp.tag1 = ?";
		return (List<PAServicePojo>)(getHibernateTemplate().find(query, tag1));
	}

	public List<PAServicePojo> findByLeftnum(Integer leftnum){
		String query = "from PAService temp where temp.leftnum = ?";
		return (List<PAServicePojo>)(getHibernateTemplate().find(query, leftnum));
	}

	public List<PAServicePojo> findByAmount(Integer amount){
		String query = "from PAService temp where temp.amount = ?";
		return (List<PAServicePojo>)(getHibernateTemplate().find(query, amount));
	}

	public List<PAServicePojo> findByCreditcost(Double creditcost){
		String query = "from PAService temp where temp.creditcost = ?";
		return (List<PAServicePojo>)(getHibernateTemplate().find(query, creditcost));
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