package com.pingancar.creditmanage.pojo;


import java.sql.Timestamp;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class OrderListPojo {

	Integer id;
	String orderlistid="";
	String paserviceid="";
	String username="";
	Timestamp ordertime;
	String status="";

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getOrderlistid() {
		return this.orderlistid;
	}

	public void setOrderlistid(String orderlistid) {
		this.orderlistid = orderlistid;
	}


	public String getPaserviceid() {
		return this.paserviceid;
	}

	public void setPaserviceid(String paserviceid) {
		this.paserviceid = paserviceid;
	}


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public Timestamp getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString(){
		String res = "";
		res += "id = " + id;
		res += ", ";
		res += "orderlistid = " + orderlistid;
		res += ", ";
		res += "paserviceid = " + paserviceid;
		res += ", ";
		res += "username = " + username;
		res += ", ";
		res += "ordertime = " + ordertime;
		res += ", ";
		res += "status = " + status;
		return res;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderListPojo other = (OrderListPojo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}