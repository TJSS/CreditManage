package com.pingancar.creditmanage.pojo;


/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class AdvertisementPojo {

	Integer id;
	String adid;
	String imgurl;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getAdid() {
		return this.adid;
	}

	public void setAdid(String adid) {
		this.adid = adid;
	}


	public String getImgurl() {
		return this.imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String toString(){
		String res = "";
		res += "id = " + id;
		res += ", ";
		res += "adid = " + adid;
		res += ", ";
		res += "imgurl = " + imgurl;
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
		AdvertisementPojo other = (AdvertisementPojo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}