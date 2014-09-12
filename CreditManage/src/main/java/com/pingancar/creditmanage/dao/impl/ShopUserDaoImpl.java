package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.ShopUserDao;
import com.pingancar.creditmanage.pojo.ShopUserPojo;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class ShopUserDaoImpl implements ShopUserDao {

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

	public ShopUserPojo findById(Integer id){
		return (ShopUserPojo)getHibernateTemplate().get(ShopUserPojo.class, id);
	}

	public List<ShopUserPojo> findAll(){
		String query = "from Shopuser";
		return (List<ShopUserPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(ShopUserPojo shopuser){
		return (Integer)getHibernateTemplate().save(shopuser);
	}

	public void delete(ShopUserPojo shopuser){
		getHibernateTemplate().delete(shopuser);
	}

	public void update(ShopUserPojo shopuser){

		getHibernateTemplate().update(shopuser);
	}

	public List<ShopUserPojo> findByShopid(String shopid){
		String query = "from ShopUserPojo temp where temp.shopid = ?";
		return (List<ShopUserPojo>)(getHibernateTemplate().find(query, shopid));
	}

	public List<ShopUserPojo> findByUsername(String username){
		String query = "from ShopUserPojo temp where temp.username = ?";
		return (List<ShopUserPojo>)(getHibernateTemplate().find(query, username));
	}

	public List<ShopUserPojo> findByPasswd(String passwd){
		String query = "from ShopUserPojo temp where temp.passwd = ?";
		return (List<ShopUserPojo>)(getHibernateTemplate().find(query, passwd));
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