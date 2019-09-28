package com.zensar.entities;
//POJO BEAN CLASS

/**
 * @author Aditee Chourasiya
 * @creation_date 25th Sept 2019 4.44 PM
 * @modification_date 25th Seot 2019 4.44 PM
 * @version 1.0
 * @copyright Zensar Technologies. All rights resesrved
 * @description IT is a persistance class
 * 				It represents database table PRODUCT
 * 				It is POJO Class
 */
public class Product {
	private int productId;
	private String name;
	private String brand;
	private double price;

	public Product() {

	}

	public Product(int productId, String name, String brand, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

}
