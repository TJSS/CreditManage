package com.pingancar.creditmanage.dao.impl;

import org.tju.scs.damai.innovationFund.pojo.ShopinfoPojo;
import org.tju.scs.damai.innovationFund.dao.ShopinfoDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class ShopinfoDaoImpl implements ShopinfoDao {

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

	public ShopinfoPojo findById(Integer id){
		return (ShopinfoPojo)getHibernateTemplate().get(ShopinfoPojo.class, id);
	}

	public List<ShopinfoPojo> findAll(){
		String query = "from ShopinfoPojo";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(ShopinfoPojo shopinfo){
		return (Integer)getHibernateTemplate().save(shopinfo);
	}

	public void delete(ShopinfoPojo shopinfo){
		getHibernateTemplate().delete(shopinfo);
	}

	public void update(ShopinfoPojo shopinfo){

		getHibernateTemplate().update(shopinfo);
	}

	public List<ShopinfoPojo> findByShopid(String shopid){
		String query = "from ShopinfoPojo temp where temp.shopid = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, shopid));
	}

	public List<ShopinfoPojo> findByPaserviceinfoid(String paserviceinfoid){
		String query = "from ShopinfoPojo temp where temp.paserviceinfoid = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, paserviceinfoid));
	}

	public List<ShopinfoPojo> findByName(String name){
		String query = "from ShopinfoPojo temp where temp.name = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, name));
	}

	public List<ShopinfoPojo> findByLocation(String location){
		String query = "from ShopinfoPojo temp where temp.location = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, location));
	}

	public List<ShopinfoPojo> findByXpos(Double xpos){
		String query = "from ShopinfoPojo temp where temp.xpos = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, xpos));
	}

	public List<ShopinfoPojo> findByYpos(Double ypos){
		String query = "from ShopinfoPojo temp where temp.ypos = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, ypos));
	}

	public List<ShopinfoPojo> findByInterf(String interf){
		String query = "from ShopinfoPojo temp where temp.interf = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, interf));
	}

	public List<ShopinfoPojo> findByTag1(String tag1){
		String query = "from ShopinfoPojo temp where temp.tag1 = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, tag1));
	}

	public List<ShopinfoPojo> findByTag2(String tag2){
		String query = "from ShopinfoPojo temp where temp.tag2 = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, tag2));
	}

	public List<ShopinfoPojo> findByCon(String con){
		String query = "from ShopinfoPojo temp where temp.con = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, con));
	}

	public List<ShopinfoPojo> findByStatus(String status){
		String query = "from ShopinfoPojo temp where temp.status = ?";
		return (List<ShopinfoPojo>)(getHibernateTemplate().find(query, status));
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