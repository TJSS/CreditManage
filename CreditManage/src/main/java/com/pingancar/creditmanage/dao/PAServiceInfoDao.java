package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.PaserviceinfoPojo;

import java.util.List;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface PaserviceinfoDao {

	public PaserviceinfoPojo findById(Integer id);

	public List<PaserviceinfoPojo> findAll();

	public Integer save(PaserviceinfoPojo paserviceinfo);

	public void delete(PaserviceinfoPojo paserviceinfo);

	public void update(PaserviceinfoPojo paserviceinfo);

	public List<PaserviceinfoPojo> findByPaserviceinfoid(Integer paserviceinfoid);

	public List<PaserviceinfoPojo> findByImgurl(String imgurl);

	public List<PaserviceinfoPojo> findByTag1(String tag1);

	public List<PaserviceinfoPojo> findByTag2(String tag2);

	public List<PaserviceinfoPojo> findByTag3(String tag3);

	public List<PaserviceinfoPojo> findByTag4(String tag4);

	public List<PaserviceinfoPojo> findByTag5(String tag5);

	public List<PaserviceinfoPojo> findByServicestart(Timestamp servicestart);

	public List<PaserviceinfoPojo> findByServiceend(Timestamp serviceend);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
