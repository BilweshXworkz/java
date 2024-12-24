class CustomerRunner{
	
	public static void main(String cust[]){
		Customer c1 = new Customer();
		c1.userName = "Bilwesh";
		c1.mobileNumber = 98746321l;
		c1.password = "Bilwesh@123";
		System.out.println(c1.userName);
		System.out.println(c1.mobileNumber);
		System.out.println(c1.password);
		
		Customer C2 = new Customer();
		C2.userName = "Binay";
		C2.mobileNumber = 2563145873l;
		C2.password = "Binay@25";
		System.out.println(C2.userName);
		System.out.println(C2.mobileNumber);
		System.out.println(C2.password);
		
		Customer c3 = new Customer();
		c3.userName = "AAAA";
		c3.mobileNumber = 1547562245;
		c3.password = "asthe";
		System.out.println(c3.userName);
		System.out.println(c3.mobileNumber);
		System.out.println(c3.password);
	}
}