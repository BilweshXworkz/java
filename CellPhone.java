class CellPhone{
	// if array is made static then its index must also be made static. 
	static String applications[]={null, null, null, null, null};
	static int index;
	
	public static boolean addApplication(String application){
		System.out.println("addApplication started");
		boolean isApplicationAdded = false;
		if(application!=null){					  // validation
			applications[index]=application;      // OR   applications[index++]=application;
			index++;
			isApplicationAdded = true;
		}
		else{
			System.out.println("Application as null already exists. ");
		}
		System.out.println("addApplication ended");
	return isApplicationAdded;
	}
	
	public static void getApplications(){
		System.out.println("getApplications started");
		for(String application:applications){    // for each
			System.out.println(application);
		}
		System.out.println("getApplications ended");
	}



}