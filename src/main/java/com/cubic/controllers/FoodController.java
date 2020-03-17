package com.cubic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cubic.dtos.FoodDto;
import com.cubic.services.FoodServices;

@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	private FoodServices foodServices;

	@GetMapping
	public FoodDto showFood() {
		return foodServices.getDummyFood();

	}

	@GetMapping(value = "/{id}")
	public FoodDto showFoodById(@PathVariable int id) {
		return foodServices.getDummyFood();

	}

	@PostMapping
	public void createFood(@RequestBody FoodDto dto) {
		System.out.println(dto.toString());
	}

	@PostMapping(value = "{id}")
	public void displayFoodById(@PathVariable int id, @RequestBody FoodDto dto) {
		System.out.println(dto.toString());
	}
	
	@PostMapping(value = "name/{name}")
	public void showFoodByName(@PathVariable("name") String name,@RequestBody FoodDto dto) {
		foodServices.createFood(dto);
		
	}
	@PostMapping(value="restaurantName/{restaurantName}")
	public void showFoodByRestaurantName(@PathVariable("restaurantName") String restaurantName, @RequestBody FoodDto dto) {
		foodServices.createRestaurantName(dto);
	}

	@GetMapping("/allfood")
	public List<FoodDto> getAllFood() {

		return foodServices.getAllDummyFood();

	}

	@PutMapping(value = "update/{id}")
	public void updateFood(@PathVariable int id, @RequestBody FoodDto dto) {
		foodServices.updateFood(id, dto);

	}

	@PutMapping(value = "update/{name}")
	public void updateFoodByName(@PathVariable String name, @RequestBody FoodDto dto) {
		foodServices.updateFoodByName(name, dto);
	}

	@GetMapping(value = "name/{name}")
	public FoodDto showFoodByName(@PathVariable String name) {
		return foodServices.getDummyFood();

	}

	@GetMapping(value = "restaurantName/{restaurantName}")
	public FoodDto showFoodByRestaurantName(@PathVariable("restaurantName") String restaurantName) {
		return foodServices.getDummyFood();
	}

	@GetMapping(value = "restaurantLocation/{restaurantLocation}")
	public FoodDto getFoodByRestaurantLocation(@PathVariable("restaurantLocation") String RestaurantLocation) {
		return foodServices.getDummyFood();

	}

}
