package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.AdvertisementPojo;

import java.util.List;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface AdvertisementDao {

	public AdvertisementPojo findById(Integer id);

	public List<AdvertisementPojo> findAll();

	public Integer save(AdvertisementPojo advertisement);

	public void delete(AdvertisementPojo advertisement);

	public void update(AdvertisementPojo advertisement);

	public List<AdvertisementPojo> findByAdid(String adid);

	public List<AdvertisementPojo> findByImgurl(String imgurl);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
