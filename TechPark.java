class TechPark{
	static String companyNames[]={null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static String newCompanyNames[]={null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int first;
	
	public static void addCompanyName(String companyName){
		if(companyName!=null){
		companyNames[first++]=companyName;
		}else	System.out.println("Null is set as default");	
	}
	
	public static void getCompanyNames(){
		for(String companyName:companyNames){
			System.out.println(companyName);
		}
	}
	
	public static boolean updateCompanyName(String oldName, String newName){
		boolean isUpdate=false;
		for(int first =0;first<companyNames.length;first++){
			if(companyNames[first]==oldName){
				companyNames[first]=newName;
				isUpdate=true;
				break;
			}
		}
		if(isUpdate==false) System.out.println(oldName+" is not found.");
		return isUpdate;
	}
	
	public static boolean deleteCompanyName(String value){
		boolean isDeleted=false;
		for(int start=0, index=0;start<companyNames.length;start++){
			if(companyNames[start]!=value){
				newCompanyNames[index++]=companyNames[start];
			}else isDeleted=true;
		}
		
		return isDeleted;
	}
	
	public static void getNewCompanyNames(){
		for(String ref:newCompanyNames){
			System.out.println(ref);
		}
		
	}
}