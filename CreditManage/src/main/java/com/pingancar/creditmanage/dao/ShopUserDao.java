package com.pingancar.creditmanage.dao;

import org.tju.scs.damai.innovationFund.pojo.ShopuserPojo;
import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface ShopuserDao {

	public ShopuserPojo findById(Integer id);

	public List<ShopuserPojo> findAll();

	public Integer save(ShopuserPojo shopuser);

	public void delete(ShopuserPojo shopuser);

	public void update(ShopuserPojo shopuser);

	public List<ShopuserPojo> findByShopid(String shopid);

	public List<ShopuserPojo> findByUsername(String username);

	public List<ShopuserPojo> findByPasswd(String passwd);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
