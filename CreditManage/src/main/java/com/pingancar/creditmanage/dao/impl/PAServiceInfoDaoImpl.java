package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.PAServiceInfoDao;
import com.pingancar.creditmanage.pojo.PAServiceInfoPojo;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class PAServiceInfoDaoImpl implements PAServiceInfoDao {

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

	public PAServiceInfoPojo findById(Integer id){
		return (PAServiceInfoPojo)getHibernateTemplate().get(PAServiceInfoPojo.class, id);
	}

	public List<PAServiceInfoPojo> findAll(){
		String query = "from PAServiceInfoPojo";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(PAServiceInfoPojo paserviceinfo){
		return (Integer)getHibernateTemplate().save(paserviceinfo);
	}

	public void delete(PAServiceInfoPojo paserviceinfo){
		getHibernateTemplate().delete(paserviceinfo);
	}

	public void update(PAServiceInfoPojo paserviceinfo){

		getHibernateTemplate().update(paserviceinfo);
	}

	public List<PAServiceInfoPojo> findByPaserviceinfoid(Integer paserviceinfoid){
		String query = "from PAServiceInfoPojo temp where temp.paserviceinfoid = ?";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query, paserviceinfoid));
	}

	public List<PAServiceInfoPojo> findByImgurl(String imgurl){
		String query = "from PAServiceInfoPojo temp where temp.imgurl = ?";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query, imgurl));
	}

	public List<PAServiceInfoPojo> findByTag1(String tag1){
		String query = "from PAServiceInfoPojo temp where temp.tag1 = ?";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query, tag1));
	}

	public List<PAServiceInfoPojo> findByTag2(String tag2){
		String query = "from PAServiceInfoPojo temp where temp.tag2 = ?";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query, tag2));
	}

	public List<PAServiceInfoPojo> findByTag3(String tag3){
		String query = "from PAServiceInfoPojo temp where temp.tag3 = ?";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query, tag3));
	}

	public List<PAServiceInfoPojo> findByTag4(String tag4){
		String query = "from PAServiceInfoPojo temp where temp.tag4 = ?";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query, tag4));
	}

	public List<PAServiceInfoPojo> findByTag5(String tag5){
		String query = "from PAServiceInfoPojo temp where temp.tag5 = ?";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query, tag5));
	}

	public List<PAServiceInfoPojo> findByServicestart(Timestamp servicestart){
		String query = "from PAServiceInfoPojo temp where temp.servicestart = ?";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query, servicestart));
	}

	public List<PAServiceInfoPojo> findByServiceend(Timestamp serviceend){
		String query = "from PAServiceInfoPojo temp where temp.serviceend = ?";
		return (List<PAServiceInfoPojo>)(getHibernateTemplate().find(query, serviceend));
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