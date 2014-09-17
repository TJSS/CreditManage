package com.pingancar.creditmanage.pojo;


import java.sql.Timestamp;

/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class UserPojo {

	Integer id;
	String passwd="";
	String username="";
	String con="";
	String email="";
	Timestamp regtime;
	Double premium;
	String insured="";
	String carowner="";
	String factory="";
	String cartype="";
	String carnumber="";
	Timestamp starttime;
	Timestamp endtime;
	String mobilephone="";

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getCon() {
		return this.con;
	}

	public void setCon(String con) {
		this.con = con;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Timestamp getRegtime() {
		return this.regtime;
	}

	public void setRegtime(Timestamp regtime) {
		this.regtime = regtime;
	}


	public Double getPremium() {
		return this.premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}


	public String getInsured() {
		return this.insured;
	}

	public void setInsured(String insured) {
		this.insured = insured;
	}


	public String getCarowner() {
		return this.carowner;
	}

	public void setCarowner(String carowner) {
		this.carowner = carowner;
	}


	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}


	public String getCartype() {
		return this.cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}


	public String getCarnumber() {
		return this.carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}


	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}


	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}


	public String getMobilephone() {
		return this.mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String toString(){
		String res = "";
		res += "id = " + id;
		res += ", ";
		res += "passwd = " + passwd;
		res += ", ";
		res += "username = " + username;
		res += ", ";
		res += "con = " + con;
		res += ", ";
		res += "email = " + email;
		res += ", ";
		res += "regtime = " + regtime;
		res += ", ";
		res += "premium = " + premium;
		res += ", ";
		res += "insured = " + insured;
		res += ", ";
		res += "carowner = " + carowner;
		res += ", ";
		res += "factory = " + factory;
		res += ", ";
		res += "cartype = " + cartype;
		res += ", ";
		res += "carnumber = " + carnumber;
		res += ", ";
		res += "starttime = " + starttime;
		res += ", ";
		res += "endtime = " + endtime;
		res += ", ";
		res += "mobilephone = " + mobilephone;
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
		UserPojo other = (UserPojo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}