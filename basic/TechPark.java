class TechPark{
	static String companysName[] = {null, null, null, null, null,
									null, null, null, null, null,
									null, null, null, null, null,};
	static String newCompanys[] = {null, null, null, null, null,
									null, null, null, null, null,
									null, null, null,null};
	static int index;
	public static boolean addTech(String company){
		System.out.println("The addTech started");
		boolean isAddTech = false;
		if(company != null){
			companysName[index] = company;
			index++;
			isAddTech = true;
			System.out.println("The name add");
		}
		else{
			System.out.println("The name is not add");
		}
		System.out.println("The addTech ended");
		return isAddTech;
	}
	
	public static void getTech(){
		System.out.println("The get tech started");
		for(String company:companysName){
			System.out.println("The Companies in TechPark : "+company);
		}
		System.out.println("The get tech ended");
	}
	
	public static boolean updateCompany(String newCompany, String oldCompany){
		boolean isCompanyUpdated = false;
		System.out.println("The updatecompany Started");
		for(int started=0; started<companysName.length; started++){
			if(companysName[started] == oldCompany){
				companysName[started] = newCompany;
				isCompanyUpdated = true;
				System.out.println("The Company name is Updated");
				break;
			}
		}
		if(isCompanyUpdated == false) System.out.println("The Company Name is not in the list");
		return isCompanyUpdated;
	}
	
	public static boolean deleteCompany(String delCompany){
		System.out.println("The deleteCompany started");
		boolean isdeleted = false;
		for(int index = 0, newIndex = 0; index<companysName.length; index++){
			String existingCompany = companysName[index];
			if(existingCompany != delCompany){
				newCompanys[newIndex++] = existingCompany;
			}
			else{
				isdeleted = true;
			}
		}
		return isdeleted;
	}
	
	public static void getNewTech(){
		for(String newCompany : newCompanys){
			System.out.println("The Companies in TechPark : "+newCompany);
		}
	}
}