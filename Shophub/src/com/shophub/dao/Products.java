package com.shophub.dao;

public class Products {
	 String name;
	 int Product_Id;
	 int Price;
	 
	public Products(String name, int product_Id, int price) {
		super();
		this.name = name;
		Product_Id = product_Id;
		Price = price;
	}
	public String getName() {
		return name;
	}
	public int getProduct_Id() {
		return Product_Id;
	}
	public int getPrice() {
		return Price;
	}
	@Override
	public String toString() {
		return "Products [name=" + name + ", Product_Id=" + Product_Id + ", Price="
				+ Price + "]";
	}
	 
	}


