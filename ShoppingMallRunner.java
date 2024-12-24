class ShoppingMallRunner{
	public static void main(String a[]){
		ShoppingMall.addShopName("Max");
		ShoppingMall.addShopName("Pantaloons");
		ShoppingMall.addShopName("Crocs");
		ShoppingMall.addShopName("H&M");
		ShoppingMall.addShopName("PVR");
		ShoppingMall.addShopName("Dmart");
		ShoppingMall.addShopName("Dominos");
		ShoppingMall.addShopName("Pizza Hut");
		ShoppingMall.addShopName("KFC");
		ShoppingMall.addShopName("Time zone");
		ShoppingMall.getShopNames();
		System.out.println("---------------------");
		boolean isUpdate=ShoppingMall.updateShopName("KFC","Arrow");
		System.out.println("Is the value updated : "+isUpdate);
		System.out.println("---------------------");
		ShoppingMall.getShopNames();
		System.out.println("---------------------");
		isUpdate=ShoppingMall.deleteShopName("PVR");
		System.out.println("Is the value deleted : "+isUpdate);
		System.out.println("---------------------");
		ShoppingMall.getShopNames();
	}
}