package com.pingancar.creditmanage.pojo;


/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class ShopUserPojo {

	Integer id;
	String shopid;
	String username;
	String passwd;

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


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String toString(){
		String res = "";
		res += "id = " + id;
		res += ", ";
		res += "shopid = " + shopid;
		res += ", ";
		res += "username = " + username;
		res += ", ";
		res += "passwd = " + passwd;
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
		ShopUserPojo other = (ShopUserPojo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}