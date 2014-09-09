package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.ShopinfoPojo;

import java.util.List;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface ShopInfoDao {

	public ShopinfoPojo findById(Integer id);

	public List<ShopinfoPojo> findAll();

	public Integer save(ShopinfoPojo shopinfo);

	public void delete(ShopinfoPojo shopinfo);

	public void update(ShopinfoPojo shopinfo);

	public List<ShopinfoPojo> findByShopid(String shopid);

	public List<ShopinfoPojo> findByPaserviceinfoid(String paserviceinfoid);

	public List<ShopinfoPojo> findByName(String name);

	public List<ShopinfoPojo> findByLocation(String location);

	public List<ShopinfoPojo> findByXpos(Double xpos);

	public List<ShopinfoPojo> findByYpos(Double ypos);

	public List<ShopinfoPojo> findByInterf(String interf);

	public List<ShopinfoPojo> findByTag1(String tag1);

	public List<ShopinfoPojo> findByTag2(String tag2);

	public List<ShopinfoPojo> findByCon(String con);

	public List<ShopinfoPojo> findByStatus(String status);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
