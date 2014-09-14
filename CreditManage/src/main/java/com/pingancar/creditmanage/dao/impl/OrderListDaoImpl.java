package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.OrderListDao;
import com.pingancar.creditmanage.pojo.OrderListPojo;
import com.pingancar.creditmanage.util.myenum.OrderListField;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.sql.Timestamp;
import java.util.List;
/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class OrderListDaoImpl implements OrderListDao {

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
    public List<OrderListPojo> queryOrderList(List<OrderListField> orderListFieldsList, List<String> valuesList) {
        String query = "select * from orderlist ol";
        for(int i = 0; i < orderListFieldsList.size(); i++){
            if( i != 0 ){
                query += " and ";
            }
            query += orderListFieldsList.get(i).toString();
        }

        return  (List<OrderListPojo>)getHibernateTemplate().find(query);
    }

    public OrderListPojo findById(Integer id){
		return (OrderListPojo)getHibernateTemplate().get(OrderListPojo.class, id);
	}

	public List<OrderListPojo> findAll(){
		String query = "from OrderList";
		return (List<OrderListPojo>)(getHibernateTemplate().find(query));
	}

    @Override
    public Integer save(OrderListPojo orderlist){
		return (Integer)getHibernateTemplate().save(orderlist);
	}

    //add()与save()有区别么？
    @Override
    public void add(OrderListPojo orderlist) {

    }

    public void delete(OrderListPojo orderlist){
		getHibernateTemplate().delete(orderlist);
	}

	public void update(OrderListPojo orderlist){

		getHibernateTemplate().update(orderlist);
	}

	public List<OrderListPojo> findByOrderlistid(String orderlistid){
		String query = "from OrderList temp where temp.orderlistid = ?";
		return (List<OrderListPojo>)(getHibernateTemplate().find(query, orderlistid));
	}

	public List<OrderListPojo> findByPaserviceid(String paserviceid){
		String query = "from OrderList temp where temp.paserviceid = ?";
		return (List<OrderListPojo>)(getHibernateTemplate().find(query, paserviceid));
	}

	public List<OrderListPojo> findByUsername(String username){
		String query = "from OrderList temp where temp.username = ?";
		return (List<OrderListPojo>)(getHibernateTemplate().find(query, username));
	}

    @Override
    public List<OrderListPojo> findByOrdertime(Timestamp ordertime){
		String query = "from OrderList temp where temp.ordertime = ?";
		return (List<OrderListPojo>)(getHibernateTemplate().find(query, ordertime));
	}

	public List<OrderListPojo> findByStatus(String status){
		String query = "from OrderList temp where temp.status = ?";
		return (List<OrderListPojo>)(getHibernateTemplate().find(query, status));
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