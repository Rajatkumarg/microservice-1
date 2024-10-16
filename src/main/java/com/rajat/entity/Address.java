package com.rajat.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

	private int addressId;
	private String city;
	private String state;
	private int rollOfStudent;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getRollOfStudent() {
		return rollOfStudent;
	}
	public void setRollOfStudent(int rollOfStudent) {
		this.rollOfStudent = rollOfStudent;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", rollOfStudent="
				+ rollOfStudent + "]";
	}
	
}
