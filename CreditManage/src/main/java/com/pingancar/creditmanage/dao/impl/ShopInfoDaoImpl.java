package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.ShopInfoDao;
import com.pingancar.creditmanage.pojo.ShopInfoPojo;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class ShopInfoDaoImpl implements ShopInfoDao {

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

	public ShopInfoPojo findById(Integer id){
		return (ShopInfoPojo)getHibernateTemplate().get(ShopInfoPojo.class, id);
	}

	public List<ShopInfoPojo> findAll(){
		String query = "from ShopInfo";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(ShopInfoPojo shopinfo){
		return (Integer)getHibernateTemplate().save(shopinfo);
	}

	public void delete(ShopInfoPojo shopinfo){
		getHibernateTemplate().delete(shopinfo);
	}

	public void update(ShopInfoPojo shopinfo){

		getHibernateTemplate().update(shopinfo);
	}

	public List<ShopInfoPojo> findByShopid(String shopid){
		String query = "from ShopInfo temp where temp.shopid = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, shopid));
	}

	public List<ShopInfoPojo> findByPaserviceinfoid(String paserviceinfoid){
		String query = "from ShopInfo temp where temp.paserviceinfoid = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, paserviceinfoid));
	}

	public List<ShopInfoPojo> findByName(String name){
		String query = "from ShopInfo temp where temp.name = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, name));
	}

	public List<ShopInfoPojo> findByLocation(String location){
		String query = "from ShopInfo temp where temp.location = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, location));
	}

	public List<ShopInfoPojo> findByXpos(Double xpos){
		String query = "from ShopInfo temp where temp.xpos = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, xpos));
	}

	public List<ShopInfoPojo> findByYpos(Double ypos){
		String query = "from ShopInfo temp where temp.ypos = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, ypos));
	}

	public List<ShopInfoPojo> findByInterf(String interf){
		String query = "from ShopInfo temp where temp.interf = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, interf));
	}

	public List<ShopInfoPojo> findByTag1(String tag1){
		String query = "from ShopInfo temp where temp.tag1 = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, tag1));
	}

	public List<ShopInfoPojo> findByTag2(String tag2){
		String query = "from ShopInfo temp where temp.tag2 = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, tag2));
	}

	public List<ShopInfoPojo> findByCon(String con){
		String query = "from ShopInfo temp where temp.con = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, con));
	}

	public List<ShopInfoPojo> findByStatus(String status){
		String query = "from ShopInfo temp where temp.status = ?";
		return (List<ShopInfoPojo>)(getHibernateTemplate().find(query, status));
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