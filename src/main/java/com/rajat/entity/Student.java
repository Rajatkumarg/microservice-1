package com.rajat.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Student {

	@Id
	private int roll;
	private String name;
	private List<Address> addresses;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", addresses=" + addresses + "]";
	}
	
}
