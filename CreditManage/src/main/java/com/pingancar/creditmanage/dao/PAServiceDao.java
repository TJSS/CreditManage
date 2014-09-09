package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.PaservicePojo;

import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface PaserviceDao {

	public PaservicePojo findById(Integer id);

	public List<PaservicePojo> findAll();

	public Integer save(PaservicePojo paservice);

	public void delete(PaservicePojo paservice);

	public void update(PaservicePojo paservice);

	public List<PaservicePojo> findByPaserviceinfoid(String paserviceinfoid);

	public List<PaservicePojo> findByPaserviceid(String paserviceid);

	public List<PaservicePojo> findByType(String type);

	public List<PaservicePojo> findByTag1(String tag1);

	public List<PaservicePojo> findByLeftnum(Integer leftnum);

	public List<PaservicePojo> findByAmount(Integer amount);

	public List<PaservicePojo> findByCreditcost(Double creditcost);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
