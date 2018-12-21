package com.freakyshoe.bean;

public class ProductBean {
	
	private long productId;
	private String productName;
	private double price;
	private int quantity;
	
	public ProductBean() {
		// TODO Auto-generated constructor stub
	}
	public ProductBean(long productId, String productName, double price,
			int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
