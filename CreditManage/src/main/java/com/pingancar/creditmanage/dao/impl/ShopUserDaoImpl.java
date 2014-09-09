package com.pingancar.creditmanage.dao.impl;

import org.tju.scs.damai.innovationFund.pojo.ShopuserPojo;
import org.tju.scs.damai.innovationFund.dao.ShopuserDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class ShopuserDaoImpl implements ShopuserDao {

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

	public ShopuserPojo findById(Integer id){
		return (ShopuserPojo)getHibernateTemplate().get(ShopuserPojo.class, id);
	}

	public List<ShopuserPojo> findAll(){
		String query = "from ShopuserPojo";
		return (List<ShopuserPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(ShopuserPojo shopuser){
		return (Integer)getHibernateTemplate().save(shopuser);
	}

	public void delete(ShopuserPojo shopuser){
		getHibernateTemplate().delete(shopuser);
	}

	public void update(ShopuserPojo shopuser){

		getHibernateTemplate().update(shopuser);
	}

	public List<ShopuserPojo> findByShopid(String shopid){
		String query = "from ShopuserPojo temp where temp.shopid = ?";
		return (List<ShopuserPojo>)(getHibernateTemplate().find(query, shopid));
	}

	public List<ShopuserPojo> findByUsername(String username){
		String query = "from ShopuserPojo temp where temp.username = ?";
		return (List<ShopuserPojo>)(getHibernateTemplate().find(query, username));
	}

	public List<ShopuserPojo> findByPasswd(String passwd){
		String query = "from ShopuserPojo temp where temp.passwd = ?";
		return (List<ShopuserPojo>)(getHibernateTemplate().find(query, passwd));
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