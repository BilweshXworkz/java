class Blinkit{
	static String productNames[]={null, null, null, null, null, null, null, null};
	static int position;
	
	public static void addProductName(String productName){
		if(productName!=null){
			productNames[position++]=productName;
		}else System.out.println("null is set as default.");
		
	}
	
	public static void getProductNames(){
		for(String productName:productNames){
			System.out.println(productName);
		}
	}
	public static boolean editProductName(String oldName, String newName){
		boolean isEdit=false;
		for(int index =0;index<productNames.length;index++){
			if(productNames[index]==oldName){
				productNames[index]=newName;
				isEdit=true;
				break;
			}
		}
		if(isEdit==false) System.out.println(oldName+" is not found.");
		return isEdit;
	}
}