class DoorDash{
	
	public static double search(String foodItem){
		double amt = 0;
		if(foodItem == "Cookie"){
			return 220.25;
		}
		if(foodItem == "Cracker"){
			return 150.50;
		}
		if(foodItem == "Ginger Snap"){
			return 175.55;
		}
		if(foodItem == "Hardtack"){
			return 140.25;
		}
		if(foodItem == "Abernethy"){
			return 275.25;
		}
		if(foodItem == "Acıbadem kurabiyesi"){
			return 175.25;
		}
		if(foodItem == "Afghan biscuits"){
			return 155.50;
		}
		if(foodItem == "Alfajor"){
			return 250.90;
		}
		if(foodItem == "Almond biscuit"){
			return 100.99;
		}
		if(foodItem == "Lebkuchen"){
			return 125.22;
		}
		if(foodItem == "Aachener Printen"){
			return 255.75;
		}
		if(foodItem == "Cornish fairing"){
			return 150.25;
		}
		if(foodItem == "Speculaas"){
			return 200.55;
		}
		if(foodItem == "Springerle"){
			return 250.55;
		}
		if(foodItem == "Kruidnoten"){
			return 150.56;
		}
		if(foodItem == "Sesame snap"){
			return 256.25;
		}
		else{
			System.out.println("The Item is not found");
		}
		return amt;
	}
}