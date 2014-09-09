package com.pingancar.creditmanage.pojo;


/**
 *Created by system on Tue Sep 09 11:17:13 CST 2014
 */
public class PaservicePojo {

	Integer id;
	String paserviceinfoid;
	String paserviceid;
	String type;
	String tag1;
	Integer leftnum;
	Integer amount;
	Double creditcost;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getPaserviceinfoid() {
		return this.paserviceinfoid;
	}

	public void setPaserviceinfoid(String paserviceinfoid) {
		this.paserviceinfoid = paserviceinfoid;
	}


	public String getPaserviceid() {
		return this.paserviceid;
	}

	public void setPaserviceid(String paserviceid) {
		this.paserviceid = paserviceid;
	}


	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getTag1() {
		return this.tag1;
	}

	public void setTag1(String tag1) {
		this.tag1 = tag1;
	}


	public Integer getLeftnum() {
		return this.leftnum;
	}

	public void setLeftnum(Integer leftnum) {
		this.leftnum = leftnum;
	}


	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	public Double getCreditcost() {
		return this.creditcost;
	}

	public void setCreditcost(Double creditcost) {
		this.creditcost = creditcost;
	}

	public String toString(){
		String res = "";
		res += "id = " + id;
		res += ", ";
		res += "paserviceinfoid = " + paserviceinfoid;
		res += ", ";
		res += "paserviceid = " + paserviceid;
		res += ", ";
		res += "type = " + type;
		res += ", ";
		res += "tag1 = " + tag1;
		res += ", ";
		res += "leftnum = " + leftnum;
		res += ", ";
		res += "amount = " + amount;
		res += ", ";
		res += "creditcost = " + creditcost;
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
		PaservicePojo other = (PaservicePojo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}