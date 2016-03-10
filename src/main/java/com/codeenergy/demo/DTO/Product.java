package com.codeenergy.demo.DTO;

public class Product {
	private Integer id;
	private String name;
	private Float price;
	private String description;
	
	public Product(){
		
	}

	public Product(Integer id, String name, Float price, String descrption) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = descrption;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescrption() {
		return description;
	}

	public void setDescrption(String descrption) {
		this.description = descrption;
	}
	
	
}
