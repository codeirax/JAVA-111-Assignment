package com.masai.intrp1;

public interface Hotel {
	
	void chickenBiryani();
	void masalaDosa();
	
	
	default void welcomeDrink() {
		
		System.out.println("welcome Drink from Hotel");
		
	}
	
	static void drinkingWater() {
	
		System.out.println("Drinking water from Hotel");
	}

}

// 1000 