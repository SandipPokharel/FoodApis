package com.cubic.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cubic.dtos.FoodDto;

@Service
public class FoodServices {

	public FoodDto getDummyFood() {

		FoodDto dto = new FoodDto();
		dto.setName("Momo");
		dto.setRestaurantName("EverestMomo");
		dto.setRestaurantLocation("Lainchaur,Kathmandu");

		return dto;
	}

	public List<FoodDto> getAllDummyFood() {
    List<FoodDto> food = new ArrayList<FoodDto>();
		
		FoodDto dto = new FoodDto();
		dto.setName("Momo");
		dto.setRestaurantName("EverestMomo");
		dto.setRestaurantLocation("Lainchaur,Kathmandu");
		
		FoodDto dto1 = new FoodDto();
		dto1.setName("Momo");
		dto1.setRestaurantName("EverestMomo");
		dto1.setRestaurantLocation("Lainchaur,Kathmandu");
		
		FoodDto dto2 = new FoodDto();
		dto2.setName("Momo");
		dto2.setRestaurantName("EverestMomo");
		dto2.setRestaurantLocation("Lainchaur,Kathmandu");
		
		food.add(dto);
		food.add(dto1);
		food.add(dto2);
		
		return food;
		
	}

	public void updateFood(int id , FoodDto dto) {
		
	}
	
	public void updateFoodByName(String name, FoodDto dto) {
		
	}

	public void createFood(FoodDto dto) {
		
	}

	public void createRestaurantName(FoodDto dto) {
		
		
	}
	
}
