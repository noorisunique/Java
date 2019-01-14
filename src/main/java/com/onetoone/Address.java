package com.onetoone;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	@JoinColumn(name = "addressId")
	private int addressId;

	@JoinColumn(name = "city")
	private String city;

	public Address() {
	}

	public Address(int addressId, String city) {
		super();
		this.addressId = addressId;
		this.city = city;
	}

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

}