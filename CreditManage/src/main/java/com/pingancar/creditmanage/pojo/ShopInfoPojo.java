package com.pingancar.creditmanage.pojo;


/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class ShopInfoPojo {

	Integer id;
	String shopid="";
	String paserviceinfoid="";
	String name="";
	String location="";
	Double xpos;
	Double ypos;
	String interf="";
	String tag1="";
	String tag2="";
	String con="";
	String status="";

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}


	public String getPaserviceinfoid() {
		return this.paserviceinfoid;
	}

	public void setPaserviceinfoid(String paserviceinfoid) {
		this.paserviceinfoid = paserviceinfoid;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public Double getXpos() {
		return this.xpos;
	}

	public void setXpos(Double xpos) {
		this.xpos = xpos;
	}


	public Double getYpos() {
		return this.ypos;
	}

	public void setYpos(Double ypos) {
		this.ypos = ypos;
	}


	public String getInterf() {
		return this.interf;
	}

	public void setInterf(String interf) {
		this.interf = interf;
	}


	public String getTag1() {
		return this.tag1;
	}

	public void setTag1(String tag1) {
		this.tag1 = tag1;
	}


	public String getTag2() {
		return this.tag2;
	}

	public void setTag2(String tag2) {
		this.tag2 = tag2;
	}


	public String getCon() {
		return this.con;
	}

	public void setCon(String con) {
		this.con = con;
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
		res += "shopid = " + shopid;
		res += ", ";
		res += "paserviceinfoid = " + paserviceinfoid;
		res += ", ";
		res += "name = " + name;
		res += ", ";
		res += "location = " + location;
		res += ", ";
		res += "xpos = " + xpos;
		res += ", ";
		res += "ypos = " + ypos;
		res += ", ";
		res += "interf = " + interf;
		res += ", ";
		res += "tag1 = " + tag1;
		res += ", ";
		res += "tag2 = " + tag2;
		res += ", ";
		res += "con = " + con;
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
		ShopInfoPojo other = (ShopInfoPojo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}