class UberEat{
	
	public static double searching(String food){
		double amt = 0;
		if(food == "Cheesecake"){
			return 520.25;
		}
		if(food == "Chocolate cake"){
			return 650.50;
		}
		if(food == "Carrot cake"){
			return 575.55;
		}
		if(food == "Strawberry cake"){
			return 820.25;
		}
		if(food == "Ice-cream cake"){
			return 575.25;
		}
		if(food == "Vanilla cake"){
			return 475.25;
		}
		if(food == "Red velvet cake"){
			return 655.50;
		}
		if(food == "Cupcake"){
			return 650.90;
		}
		if(food == "Almond biscuit"){
			return 100.99;
		}
		if(food == "Fudge cake"){
			return 925.22;
		}
		if(food == "Amandine"){
			return 655.75;
		}
		if(food == "Cornish fairing"){
			return 150.25;
		}
		if(food == "Pancake"){
			return 800.55;
		}
		if(food == "Poundcake"){
			return 950.55;
		}
		if(food == "Honeycake"){
			return 150.56;
		}
		if(food == "Angel cake"){
			return 256.25;
		}
		else{
			System.out.println("The Item is not found");
		}
		return amt;
	}
}