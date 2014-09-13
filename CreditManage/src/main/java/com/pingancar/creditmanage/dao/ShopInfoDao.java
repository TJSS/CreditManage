package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.ShopInfoPojo;
import com.pingancar.creditmanage.util.myenum.ShopInfoField;

import java.util.List;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface ShopInfoDao {

    public List<ShopInfoPojo> queryShopInfo(List<ShopInfoField> shopInfoList,List<String> valuesList);

	public ShopInfoPojo findById(Integer id);

	public List<ShopInfoPojo> findAll();

	public Integer save(ShopInfoPojo shopinfo);

    public void add(ShopInfoPojo shopinfo);

	public void delete(ShopInfoPojo shopinfo);

	public void update(ShopInfoPojo shopinfo);

	public List<ShopInfoPojo> findByShopid(String shopid);

	public List<ShopInfoPojo> findByPaserviceinfoid(String paserviceinfoid);

	public List<ShopInfoPojo> findByName(String name);

	public List<ShopInfoPojo> findByLocation(String location);

	public List<ShopInfoPojo> findByXpos(Double xpos);

	public List<ShopInfoPojo> findByYpos(Double ypos);

	public List<ShopInfoPojo> findByInterf(String interf);

	public List<ShopInfoPojo> findByTag1(String tag1);

	public List<ShopInfoPojo> findByTag2(String tag2);

	public List<ShopInfoPojo> findByCon(String con);

	public List<ShopInfoPojo> findByStatus(String status);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
