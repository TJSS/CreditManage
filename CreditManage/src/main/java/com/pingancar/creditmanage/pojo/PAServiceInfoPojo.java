package com.pingancar.creditmanage.pojo;


/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class PAServiceInfoPojo {

	Integer paserviceinfoid;
	String imgurl;
	String tag1;
	String tag2;
	String tag3;
	String tag4;
	String tag5;
	Timestamp servicestart;
	Timestamp serviceend;

	public Integer getPaserviceinfoid() {
		return this.paserviceinfoid;
	}

	public void setPaserviceinfoid(Integer paserviceinfoid) {
		this.paserviceinfoid = paserviceinfoid;
	}


	public String getImgurl() {
		return this.imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
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


	public String getTag3() {
		return this.tag3;
	}

	public void setTag3(String tag3) {
		this.tag3 = tag3;
	}


	public String getTag4() {
		return this.tag4;
	}

	public void setTag4(String tag4) {
		this.tag4 = tag4;
	}


	public String getTag5() {
		return this.tag5;
	}

	public void setTag5(String tag5) {
		this.tag5 = tag5;
	}


	public Timestamp getServicestart() {
		return this.servicestart;
	}

	public void setServicestart(Timestamp servicestart) {
		this.servicestart = servicestart;
	}


	public Timestamp getServiceend() {
		return this.serviceend;
	}

	public void setServiceend(Timestamp serviceend) {
		this.serviceend = serviceend;
	}

	public String toString(){
		String res = "";
		res += "paserviceinfoid = " + paserviceinfoid;
		res += ", ";
		res += "imgurl = " + imgurl;
		res += ", ";
		res += "tag1 = " + tag1;
		res += ", ";
		res += "tag2 = " + tag2;
		res += ", ";
		res += "tag3 = " + tag3;
		res += ", ";
		res += "tag4 = " + tag4;
		res += ", ";
		res += "tag5 = " + tag5;
		res += ", ";
		res += "servicestart = " + servicestart;
		res += ", ";
		res += "serviceend = " + serviceend;
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
		PAServiceInfoPojo other = (PAServiceInfoPojo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}