class Dunzo{
	public static void main(String[] icecream){
		double price = search("");
		System.out.println(price);
	}
	
	public static double search(String items){
		double amt = 0;
		if(items == "Chocolate"){
			return 220.25;
		}
		if(items == "Vanilla"){
			return 150.50;
		}
		if(items == "Cookies and cream"){
			return 575.55;
		}
		if(items == "Mint chocolate"){
			return 520.25;
		}
		if(items == "Rocky Road"){
			return 285.25;
		}
		if(items == "Blue Moon"){
			return 165.25;
		}
		if(items == "Queso"){
			return 455.50;
		}
		if(items == "Hokey Pokey"){
			return 650.90;
		}
		if(items == "Almond biscuit"){
			return 122.99;
		}
		if(items == "Moose Tracks"){
			return 525.22;
		}
		if(items == "Tiger Tail"){
			return 255.75;
		}
		if(items == "Strawberry"){
			return 240.25;
		}
		if(items == "Superman"){
			return 800.55;
		}
		if(items == "Poundcake"){
			return 950.55;
		}
		if(items == "Spumoni"){
			return 350.56;
		}
		if(items == "Pistachio"){
			return 656.25;
		}
		else{
			System.out.println("The Item is not found");
			return amt;
		}
		//return amt;
	}
}