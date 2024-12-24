class PhonePeRunner{

	public static void main(String a[]){
		PhonePe.addInsurance("Bike Insurace");
		PhonePe.addInsurance("Car Insurance");
		PhonePe.addInsurance("Life Insurance");
		PhonePe.addInsurance("Health Insurance");
		PhonePe.addInsurance("Travel Insurance");
		System.out.println("---------------------");
		PhonePe.getInsurances();
		System.out.println("---------------------");
		boolean isUpdate=PhonePe.updateInsurance(" Insurance", "Accident Insurance");
		System.out.println("Is value updated : "+isUpdate);
		System.out.println("---------------------");
		PhonePe.getInsurances();
		System.out.println("---------------------");
		isUpdate=PhonePe.deleteInsurance("Car Insurance");
		System.out.println("Is the value deleted : "+isUpdate);
		System.out.println("---------------------");
		PhonePe.getInsurances();
	
}
}