package com.swati.web.WebServiceAssignment;

import java.util.HashMap;
import java.util.Map;

public class AddressService {
	public Map<Integer, Address> address = AddressData.getAddress();

	public AddressService() {
		address.put(490022, new Address("Maharashtra", "Mumbai", "India"));
		address.put(492000, new Address("Karnataka", "Bangalore", "India"));
	}

	public Address getAddress(long zipcode) {
		return address.get(zipcode);
	}

}
