package com.streamapi;

public class Product {
	int num;
	String name;
	double price;
	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + "]";
	}
	public Product(int num, String name, double price) {
		this.num = num;
		this.name = name;
		this.price = price;
	}
	

}
