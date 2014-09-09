package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.CreditPojo;

import java.util.List;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface CreditDao {

	public CreditPojo findById(Integer id);

	public List<CreditPojo> findAll();

	public Integer save(CreditPojo credit);

	public void delete(CreditPojo credit);

	public void update(CreditPojo credit);

	public List<CreditPojo> findByUsername(String username);

	public List<CreditPojo> findByCredit(Double credit);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
