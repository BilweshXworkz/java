class Bank{
	static String accountNames[]={null, null, null, null, null};
	static int first;
	public static void addAccountName(String accountName){
		if(accountName!=null){
					accountNames[first++]=accountName;
		}else System.out.println("null is set as default.");
	}
	
	public static void getAccountNames(){
		for(String accountName:accountNames){
			System.out.println(accountName);
		}
	}
	
	public static boolean editAccountName(String existingName, String newName){
		boolean isEdit=false;
		for(int start=0;start<accountNames.length;start++){
			if(accountNames[start]==existingName){
				accountNames[start]=newName;
				isEdit=true;
				break;
			}
		}
		if(isEdit==false) System.out.println(existingName+" id not found.");
		return isEdit;
	}
	public static void deleteAccount(String value){
		int index=0;
		for(int start=0;start<accountNames.length;start++){
			if(accountNames[start]==value){
				index = start;
				break;
			}
		}
		for(int position=index;position<accountNames.length-1;position++){
			/*Asset Account             0
			Liability Account			1
			Equity Account				2
			Revenue Account				3
			Liquid Account 				4	*/
			accountNames[position]=accountNames[position+1];
		}
		accountNames[accountNames.length-1]=null;
	}
}