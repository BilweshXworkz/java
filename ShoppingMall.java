import java.util.Arrays;
class ShoppingMall{

	static String shopNames[]={null, null, null, null, null, null, null, null, null, null};
	static int begin;
	
	public static void addShopName(String shopName){
		if(shopName!=null){
					shopNames[begin++]=shopName;
		}else System.out.println("null is set as default.");
		
	}
	
	public static void getShopNames(){
		for(String shopName:shopNames){
			System.out.println(shopName);
		}
	}
	
	public static boolean updateShopName(String oldShopName, String newShopName){
		boolean isUpdate=false;
		for(int begin=0;begin<shopNames.length;begin++){
			if(shopNames[begin]==oldShopName){
				shopNames[begin]=newShopName;
				isUpdate=true;
				break;
			}
		}
		if(isUpdate==false)System.out.println(oldShopName+" is not found.");
		return isUpdate;
	}
	
	public static boolean deleteShopName(String name){
		boolean isDeleted=false;
		int index, start;
		for(index=0, start=0;index<shopNames.length;index++){
			if(shopNames[index]!=name){
				shopNames[start++]=shopNames[index];
			}else isDeleted=true;
		}
		shopNames=Arrays.copyOf(shopNames, start);
		return isDeleted;
	}
	
}