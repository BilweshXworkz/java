class BlinkitRunner{
	public static void main (String a[]){
		Blinkit.addProductName("Coca-Cola");
		Blinkit.addProductName("red bull");
		Blinkit.addProductName("Haldiram's Bhujia");
		Blinkit.addProductName("Doritos Cheese Nachos");
		Blinkit.addProductName("Brown Rolling Paper");
		Blinkit.addProductName("Amul Pure Milk Cheese Slices");
		Blinkit.addProductName("Amul Salted Butter");
		Blinkit.addProductName("Bisleri");		
		Blinkit.getProductNames();
		System.out.println("---------------------");
		boolean isUpdate=Blinkit.editProductName("red bull", "Red Bull");
		System.out.println("---------------------");
		System.out.println("Is the value updated : "+isUpdate);
		System.out.println("---------------------");
		Blinkit.getProductNames();
		System.out.println("---------------------");
		
	}
}