package com.pingancar.creditmanage.dao.impl;

import org.tju.scs.damai.innovationFund.pojo.PaserviceinfoPojo;
import org.tju.scs.damai.innovationFund.dao.PaserviceinfoDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class PaserviceinfoDaoImpl implements PaserviceinfoDao {

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

	public PaserviceinfoPojo findById(Integer id){
		return (PaserviceinfoPojo)getHibernateTemplate().get(PaserviceinfoPojo.class, id);
	}

	public List<PaserviceinfoPojo> findAll(){
		String query = "from PaserviceinfoPojo";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(PaserviceinfoPojo paserviceinfo){
		return (Integer)getHibernateTemplate().save(paserviceinfo);
	}

	public void delete(PaserviceinfoPojo paserviceinfo){
		getHibernateTemplate().delete(paserviceinfo);
	}

	public void update(PaserviceinfoPojo paserviceinfo){

		getHibernateTemplate().update(paserviceinfo);
	}

	public List<PaserviceinfoPojo> findByPaserviceinfoid(Integer paserviceinfoid){
		String query = "from PaserviceinfoPojo temp where temp.paserviceinfoid = ?";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query, paserviceinfoid));
	}

	public List<PaserviceinfoPojo> findByImgurl(String imgurl){
		String query = "from PaserviceinfoPojo temp where temp.imgurl = ?";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query, imgurl));
	}

	public List<PaserviceinfoPojo> findByTag1(String tag1){
		String query = "from PaserviceinfoPojo temp where temp.tag1 = ?";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query, tag1));
	}

	public List<PaserviceinfoPojo> findByTag2(String tag2){
		String query = "from PaserviceinfoPojo temp where temp.tag2 = ?";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query, tag2));
	}

	public List<PaserviceinfoPojo> findByTag3(String tag3){
		String query = "from PaserviceinfoPojo temp where temp.tag3 = ?";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query, tag3));
	}

	public List<PaserviceinfoPojo> findByTag4(String tag4){
		String query = "from PaserviceinfoPojo temp where temp.tag4 = ?";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query, tag4));
	}

	public List<PaserviceinfoPojo> findByTag5(String tag5){
		String query = "from PaserviceinfoPojo temp where temp.tag5 = ?";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query, tag5));
	}

	public List<PaserviceinfoPojo> findByServicestart(Timestamp servicestart){
		String query = "from PaserviceinfoPojo temp where temp.servicestart = ?";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query, servicestart));
	}

	public List<PaserviceinfoPojo> findByServiceend(Timestamp serviceend){
		String query = "from PaserviceinfoPojo temp where temp.serviceend = ?";
		return (List<PaserviceinfoPojo>)(getHibernateTemplate().find(query, serviceend));
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