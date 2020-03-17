package com.cubic.dtos;

import java.io.Serializable;

public class FoodDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String restaurantName;
	private String restaurantLocation;
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
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantLocation() {
		return restaurantLocation;
	}
	public void setRestaurantLocation(String restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}
	@Override
	public String toString() {
		return "FoodDto [id=" + id + ", name=" + name + ", restaurantName=" + restaurantName + ", restaurantLocation="
				+ restaurantLocation + "]";
	}
	

}
