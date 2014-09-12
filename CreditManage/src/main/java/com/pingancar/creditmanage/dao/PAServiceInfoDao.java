package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.PAServiceInfoPojo;

import java.util.List;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public interface PAServiceInfoDao {

	public PAServiceInfoPojo findById(Integer id);

	public List<PAServiceInfoPojo> findAll();

	public Integer save(PAServiceInfoPojo paserviceinfo);

	public void delete(PAServiceInfoPojo paserviceinfo);

	public void update(PAServiceInfoPojo paserviceinfo);

	public List<PAServiceInfoPojo> findByPaserviceinfoid(Integer paserviceinfoid);

	public List<PAServiceInfoPojo> findByImgurl(String imgurl);

	public List<PAServiceInfoPojo> findByTag1(String tag1);

	public List<PAServiceInfoPojo> findByTag2(String tag2);

	public List<PAServiceInfoPojo> findByTag3(String tag3);

	public List<PAServiceInfoPojo> findByTag4(String tag4);

	public List<PAServiceInfoPojo> findByTag5(String tag5);

	public List<PAServiceInfoPojo> findByServicestart(Timestamp servicestart);

	public List<PAServiceInfoPojo> findByServiceend(Timestamp serviceend);

	public List findBySqlSentence(String queryString);

	public List findBySqlSentence(String queryString, Object value);

	public List findBySqlSentence(String queryString, Object... values);

}
