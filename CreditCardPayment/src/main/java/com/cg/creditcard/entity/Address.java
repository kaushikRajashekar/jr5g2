package com.cg.creditcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	@Id
	private int door_no;
	@Column
	private String street;
	@Column
	private String area;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int pincode;
	public Address() {
		
	}
	public Address(int door_no, String street, String area, String city, String state, int pincode) {
		super();
		this.door_no = door_no;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public int getDoor_no() {
		return door_no;
	}
	public void setDoor_no(int door_no) {
		this.door_no = door_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [door_no=" + door_no + ", street=" + street + ", area=" + area + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
}
