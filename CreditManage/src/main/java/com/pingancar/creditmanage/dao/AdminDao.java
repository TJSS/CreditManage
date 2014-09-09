package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.AdminPojo;

import java.util.List;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface AdminDao {

	public AdminPojo findById(Integer id);

	public List<AdminPojo> findAll();

	public Integer save(AdminPojo admin);

	public void delete(AdminPojo admin);

	public void update(AdminPojo admin);

	public List<AdminPojo> findByUsername(String username);

	public List<AdminPojo> findByPasswd(String passwd);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
