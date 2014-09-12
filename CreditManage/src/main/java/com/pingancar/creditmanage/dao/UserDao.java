package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.UserPojo;

import java.sql.Timestamp;
import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface UserDao {

	public UserPojo findById(Integer id);

	public List<UserPojo> findAll();

	public Integer save(UserPojo user);

	public void delete(UserPojo user);

	public void update(UserPojo user);

	public List<UserPojo> findByPasswd(String passwd);

	public List<UserPojo> findByUsername(String username);

	public List<UserPojo> findByCon(String con);

	public List<UserPojo> findByEmail(String email);

	public List<UserPojo> findByRegtime(Timestamp regtime);

	public List<UserPojo> findByPremium(Double premium);

	public List<UserPojo> findByInsured(String insured);

	public List<UserPojo> findByCarowner(String carowner);

	public List<UserPojo> findByFactory(String factory);

	public List<UserPojo> findByCartype(String cartype);

	public List<UserPojo> findByCarnumber(String carnumber);

	public List<UserPojo> findByStarttime(Timestamp starttime);

	public List<UserPojo> findByEndtime(Timestamp endtime);

	public List<UserPojo> findByMobilephone(String mobilephone);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
