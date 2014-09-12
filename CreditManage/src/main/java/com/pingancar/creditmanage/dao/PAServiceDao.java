package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.PAServicePojo;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface PAServiceDao {

	public PAServicePojo findById(Integer id);

	public List<PAServicePojo> findAll();

	public Integer save(PAServicePojo paservice);

	public void delete(PAServicePojo paservice);

	public void update(PAServicePojo paservice);

	public List<PAServicePojo> findByPaserviceinfoid(String paserviceinfoid);

	public List<PAServicePojo> findByPaserviceid(String paserviceid);

	public List<PAServicePojo> findByType(String type);

	public List<PAServicePojo> findByTag1(String tag1);

	public List<PAServicePojo> findByLeftnum(Integer leftnum);

	public List<PAServicePojo> findByAmount(Integer amount);

	public List<PAServicePojo> findByCreditcost(Double creditcost);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
