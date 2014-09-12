package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.ShopUserPojo;
import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface ShopUserDao {

	public ShopUserPojo findById(Integer id);

	public List<ShopUserPojo> findAll();

	public Integer save(ShopUserPojo shopuser);

	public void delete(ShopUserPojo shopuser);

	public void update(ShopUserPojo shopuser);

	public List<ShopUserPojo> findByShopid(String shopid);

	public List<ShopUserPojo> findByUsername(String username);

	public List<ShopUserPojo> findByPasswd(String passwd);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
