class Zomato{
	
	public static double searchFood(String foodItem){
		double amt = 0;
		if(foodItem == "Chicken Biryani"){
			return 250.25;
		}
		if(foodItem == "Thali"){
			return 150.50;
		}
		if(foodItem == "Rolls"){
			return 75.55;
		}
		if(foodItem == "Paratha"){
			return 120.25;
		}
		if(foodItem == "Fried Rice"){
			return 75.55;
		}
		if(foodItem == "Bread omelette"){
			return 75.25;
		}
		if(foodItem == "Poori bhaji"){
			return 55.50;
		}
		if(foodItem == "Green Salad"){
			return 50.90;
		}
		if(foodItem == "Pickle"){
			return 10.99;
		}
		if(foodItem == "curd"){
			return 25.22;
		}
		if(foodItem == "papad"){
			return 55.75;
		}
		if(foodItem == "Cake"){
			return 150.25;
		}
		if(foodItem == "Coffee"){
			return 50.55;
		}
		if(foodItem == "Chai"){
			return 50.55;
		}
		if(foodItem == "Paneer"){
			return 150.56;
		}
		if(foodItem == "Chole Bhature"){
			return 56.25;
		}
		else{
			System.out.println("The Item is not found");
		}
		return amt;
	}
}