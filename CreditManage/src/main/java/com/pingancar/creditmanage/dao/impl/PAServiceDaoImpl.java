package com.pingancar.creditmanage.dao.impl;

import org.tju.scs.damai.innovationFund.pojo.PaservicePojo;
import org.tju.scs.damai.innovationFund.dao.PaserviceDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class PaserviceDaoImpl implements PaserviceDao {

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

	public PaservicePojo findById(Integer id){
		return (PaservicePojo)getHibernateTemplate().get(PaservicePojo.class, id);
	}

	public List<PaservicePojo> findAll(){
		String query = "from PaservicePojo";
		return (List<PaservicePojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(PaservicePojo paservice){
		return (Integer)getHibernateTemplate().save(paservice);
	}

	public void delete(PaservicePojo paservice){
		getHibernateTemplate().delete(paservice);
	}

	public void update(PaservicePojo paservice){

		getHibernateTemplate().update(paservice);
	}

	public List<PaservicePojo> findByPaserviceinfoid(String paserviceinfoid){
		String query = "from PaservicePojo temp where temp.paserviceinfoid = ?";
		return (List<PaservicePojo>)(getHibernateTemplate().find(query, paserviceinfoid));
	}

	public List<PaservicePojo> findByPaserviceid(String paserviceid){
		String query = "from PaservicePojo temp where temp.paserviceid = ?";
		return (List<PaservicePojo>)(getHibernateTemplate().find(query, paserviceid));
	}

	public List<PaservicePojo> findByType(String type){
		String query = "from PaservicePojo temp where temp.type = ?";
		return (List<PaservicePojo>)(getHibernateTemplate().find(query, type));
	}

	public List<PaservicePojo> findByTag1(String tag1){
		String query = "from PaservicePojo temp where temp.tag1 = ?";
		return (List<PaservicePojo>)(getHibernateTemplate().find(query, tag1));
	}

	public List<PaservicePojo> findByLeftnum(Integer leftnum){
		String query = "from PaservicePojo temp where temp.leftnum = ?";
		return (List<PaservicePojo>)(getHibernateTemplate().find(query, leftnum));
	}

	public List<PaservicePojo> findByAmount(Integer amount){
		String query = "from PaservicePojo temp where temp.amount = ?";
		return (List<PaservicePojo>)(getHibernateTemplate().find(query, amount));
	}

	public List<PaservicePojo> findByCreditcost(Double creditcost){
		String query = "from PaservicePojo temp where temp.creditcost = ?";
		return (List<PaservicePojo>)(getHibernateTemplate().find(query, creditcost));
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