package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.UserDao;
import com.pingancar.creditmanage.pojo.UserPojo;
import com.pingancar.creditmanage.util.myenum.UserField;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.sql.Timestamp;
import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class UserDaoImpl implements UserDao {

	SessionFactory sessionFactory;
	HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public HibernateTemplate getHibernateTemplate() {
		if (null == hibernateTemplate) {
			hibernateTemplate = new HibernateTemplate(sessionFactory);
		}
		return hibernateTemplate;
	}

    @Override
    public List<UserPojo> queryUser(List<UserField> userFieldList, List<String> valueList) {
        String query = "select * from user ol";
        for(int i = 0; i < userFieldList.size(); i++){
            if( i != 0 ){
                query += " and ";
            }
            query += userFieldList.get(i).toString();
        }

        return  (List<UserPojo>)getHibernateTemplate().find(query);
    }

    public UserPojo findById(Integer id){
		return (UserPojo)getHibernateTemplate().get(UserPojo.class, id);
	}

	public List<UserPojo> findAll(){
		String query = "from UserTemp";
		return (List<UserPojo>)(getHibernateTemplate().find(query));
	}

	public Integer save(UserPojo user){
		return (Integer)getHibernateTemplate().save(user);
	}

	public void delete(UserPojo user){
		getHibernateTemplate().delete(user);
	}

	public void update(UserPojo user){

		getHibernateTemplate().update(user);
	}

	public List<UserPojo> findByPasswd(String passwd){
		String query = "from UserTemp temp where temp.passwd = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, passwd));
	}

	public List<UserPojo> findByUsername(String username){
		String query = "from UserTemp temp where temp.username = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, username));
	}

	public List<UserPojo> findByCon(String con){
		String query = "from UserTemp temp where temp.con = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, con));
	}

	public List<UserPojo> findByEmail(String email){
		String query = "from UserTemp temp where temp.email = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, email));
	}

	public List<UserPojo> findByRegtime(Timestamp regtime){
		String query = "from UserTemp temp where temp.regtime = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, regtime));
	}

	public List<UserPojo> findByPremium(Double premium){
		String query = "from UserTemp temp where temp.premium = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, premium));
	}

	public List<UserPojo> findByInsured(String insured){
		String query = "from UserTemp temp where temp.insured = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, insured));
	}

	public List<UserPojo> findByCarowner(String carowner){
		String query = "from UserTemp temp where temp.carowner = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, carowner));
	}

	public List<UserPojo> findByFactory(String factory){
		String query = "from UserTemp temp where temp.factory = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, factory));
	}

	public List<UserPojo> findByCartype(String cartype){
		String query = "from UserTemp temp where temp.cartype = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, cartype));
	}

	public List<UserPojo> findByCarnumber(String carnumber){
		String query = "from UserTemp temp where temp.carnumber = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, carnumber));
	}

	public List<UserPojo> findByStarttime(Timestamp starttime){
		String query = "from UserTemp temp where temp.starttime = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, starttime));
	}

	public List<UserPojo> findByEndtime(Timestamp endtime){
		String query = "from UserTemp temp where temp.endtime = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, endtime));
	}

	public List<UserPojo> findByMobilephone(String mobilephone){
		String query = "from UserTemp temp where temp.mobilephone = ?";
		return (List<UserPojo>)(getHibernateTemplate().find(query, mobilephone));
	}

	public List findBySqlSentence(String queryString){
		return getHibernateTemplate().find(queryString);
	}
	public List findBySqlSentence(String queryString, Object value){
		return getHibernateTemplate().find(queryString, value);
	}

	public List findBySqlSentence(String queryString, Object... values){
		return getHibernateTemplate().find(queryString, values);
	}

}