package com.pingancar.creditmanage.dao.impl;

import org.tju.scs.damai.innovationFund.pojo.AdvertisementPojo;
import org.tju.scs.damai.innovationFund.dao.AdvertisementDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class AdvertisementDaoImpl implements AdvertisementDao {

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

	public AdvertisementPojo findById(Integer id){
		return (AdvertisementPojo)getHibernateTemplate().get(AdvertisementPojo.class, id);
	}

	public List<AdvertisementPojo> findAll(){
		String query = "from AdvertisementPojo";
		return (List<AdvertisementPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(AdvertisementPojo advertisement){
		return (Integer)getHibernateTemplate().save(advertisement);
	}

	public void delete(AdvertisementPojo advertisement){
		getHibernateTemplate().delete(advertisement);
	}

	public void update(AdvertisementPojo advertisement){

		getHibernateTemplate().update(advertisement);
	}

	public List<AdvertisementPojo> findByAdid(String adid){
		String query = "from AdvertisementPojo temp where temp.adid = ?";
		return (List<AdvertisementPojo>)(getHibernateTemplate().find(query, adid));
	}

	public List<AdvertisementPojo> findByImgurl(String imgurl){
		String query = "from AdvertisementPojo temp where temp.imgurl = ?";
		return (List<AdvertisementPojo>)(getHibernateTemplate().find(query, imgurl));
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