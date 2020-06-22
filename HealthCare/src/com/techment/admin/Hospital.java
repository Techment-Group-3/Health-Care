package com.techment.admin;

public class Hospital {
	public int id,pincode;
	public String name,address,street,state;
	public Hospital() {}
	public Hospital(int id, int pincode, String name, String address, String street, String state) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.name = name;
		this.address = address;
		this.street = street;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
