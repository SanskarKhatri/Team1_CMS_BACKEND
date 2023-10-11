package com.ims.company;

import com.ims.address.Address;

public class Company {
	
	private long id;
	private String name;
	private Address headquarterAddress;
	private String gstin;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getHeadquarterAddress() {
		return headquarterAddress;
	}
	public void setHeadquarterAddress(Address headquarterAddress) {
		this.headquarterAddress = headquarterAddress;
	}
	public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}	
}
