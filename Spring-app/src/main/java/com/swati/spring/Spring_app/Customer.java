package com.swati.spring.Spring_app;

public class Customer {
	int customerId;
	long customerContact;
	String customerName;
	Address customerAddress;
	public Customer(int customerId, long customerContact, String customerName,
			Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerContact = customerContact;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	/*public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}*/

	public int getCustomerId() {
		return customerId;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void print()
	{
		System.out.println("Customer Id:"+getCustomerId()+" "+"Customer Contact No.:"+getCustomerContact()+" "+"Customer Name:"+getCustomerName()+" "+"Customer"+" "+getCustomerAddress());
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerContact="
				+ customerContact + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + "]";
	}
	
}
