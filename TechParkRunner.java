class TechParkRunner{
	public static void main(String a[]){
		TechPark.addCompanyName("Microsoft");
		TechPark.addCompanyName("Atlas Copco");
		TechPark.addCompanyName("Cognizant");
		TechPark.addCompanyName("IBM");
		TechPark.addCompanyName("JustDial");
		TechPark.addCompanyName("Nvidia");
		TechPark.addCompanyName("Nokia Networks");
		TechPark.addCompanyName("Cisco Systems");
		TechPark.addCompanyName("Alstom Transport");
		TechPark.addCompanyName("Amazon");
		TechPark.addCompanyName("Oracle");
		TechPark.addCompanyName("Texas Instruments");
		TechPark.addCompanyName("Dell");
		TechPark.addCompanyName("Capgemini");
		TechPark.addCompanyName("LinkedIn");		
		TechPark.getCompanyNames();
		System.out.println("-----------------------");
		boolean isEdit= TechPark.updateCompanyName("Atlas Copco","Flipcart");
		System.out.println("Is the value edited : "+isEdit);
		System.out.println("-----------------------");
		TechPark.getCompanyNames();
		System.out.println("-----------------------");
		isEdit=TechPark.deleteCompanyName("IBM");
		System.out.println("Is the value deleted : "+isEdit);
		System.out.println("-----------------------");
		TechPark.getNewCompanyNames();
	}
}