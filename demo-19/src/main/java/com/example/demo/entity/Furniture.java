package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "furnitures")
public class Furniture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="fname")
	private String name;
	@Column(name="fprice")
	private int price;
	@Column(name="fdiscount")
	private int discount;
	
	
	
	public Furniture() {
		
	}
	public Furniture(int id, String name, int price, int discount) {
		
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Furniture [id=" + id + ", name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}
	

}