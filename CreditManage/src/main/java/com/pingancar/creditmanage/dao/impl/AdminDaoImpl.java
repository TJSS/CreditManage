package com.pingancar.creditmanage.dao.impl;

import org.tju.scs.damai.innovationFund.pojo.AdminPojo;
import org.tju.scs.damai.innovationFund.dao.AdminDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class AdminDaoImpl implements AdminDao {

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

	public AdminPojo findById(Integer id){
		return (AdminPojo)getHibernateTemplate().get(AdminPojo.class, id);
	}

	public List<AdminPojo> findAll(){
		String query = "from AdminPojo";
		return (List<AdminPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(AdminPojo admin){
		return (Integer)getHibernateTemplate().save(admin);
	}

	public void delete(AdminPojo admin){
		getHibernateTemplate().delete(admin);
	}

	public void update(AdminPojo admin){

		getHibernateTemplate().update(admin);
	}

	public List<AdminPojo> findByUsername(String username){
		String query = "from AdminPojo temp where temp.username = ?";
		return (List<AdminPojo>)(getHibernateTemplate().find(query, username));
	}

	public List<AdminPojo> findByPasswd(String passwd){
		String query = "from AdminPojo temp where temp.passwd = ?";
		return (List<AdminPojo>)(getHibernateTemplate().find(query, passwd));
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