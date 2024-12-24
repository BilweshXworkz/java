class CellPhoneTester{

	public static void main(String a[]){
		System.out.println("Main started");
		boolean isApplicationAdded = CellPhone.addApplication("WhatsApp");
		System.out.println("Is application added : "+isApplicationAdded);
		isApplicationAdded=CellPhone.addApplication("Jio");
		System.out.println("Is application added : "+isApplicationAdded);
		isApplicationAdded = CellPhone.addApplication("Prime videos");
		System.out.println("Is application added : "+isApplicationAdded);
		isApplicationAdded = CellPhone.addApplication(null);
		System.out.println("Is application added : "+isApplicationAdded);
		isApplicationAdded = CellPhone.addApplication("LinkedIn");
		System.out.println("Is application added : "+isApplicationAdded);
		CellPhone.getApplications();
		System.out.println("Main ended");
	
	
	
	}

}