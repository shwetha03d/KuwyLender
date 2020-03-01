package com.kuwy.api.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class VehicleDTO {
	
	private int id;
	private int year;
	private String make;
	private String model;
	private String varient;
	private Float price;
	private String location;
	
	public VehicleDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVarient() {
		return varient;
	}

	public void setVarient(String varient) {
		this.varient = varient;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "VehicleDTO [id=" + id + ", year=" + year + ", make=" + make + ", model=" + model + ", varient="
				+ varient + ", price=" + price + ", location=" + location + "]";
	}
	
	
	
	

}
