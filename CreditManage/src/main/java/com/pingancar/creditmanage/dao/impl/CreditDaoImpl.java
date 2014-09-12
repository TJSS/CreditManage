package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.CreditDao;
import com.pingancar.creditmanage.pojo.CreditPojo;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class CreditDaoImpl implements CreditDao {

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

	public CreditPojo findById(Integer id){
		return (CreditPojo)getHibernateTemplate().get(CreditPojo.class, id);
	}

	public List<CreditPojo> findAll(){
		String query = "from CreditPojo";
		return (List<CreditPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(CreditPojo credit){
		return (Integer)getHibernateTemplate().save(credit);
	}

	public void delete(CreditPojo credit){
		getHibernateTemplate().delete(credit);
	}

	public void update(CreditPojo credit){

		getHibernateTemplate().update(credit);
	}

	public List<CreditPojo> findByUsername(String username){
		String query = "from CreditPojo temp where temp.username = ?";
		return (List<CreditPojo>)(getHibernateTemplate().find(query, username));
	}

	public List<CreditPojo> findByCredit(Double credit){
		String query = "from CreditPojo temp where temp.credit = ?";
		return (List<CreditPojo>)(getHibernateTemplate().find(query, credit));
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