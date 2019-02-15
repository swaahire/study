package com.swati.spring.Spring_app;

public class Address {
	String street, city, state,country;
	public Address(String street, String city, String state, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}
	



	

	

	

}
