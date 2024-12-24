class Amazon{
	public static void main(String Shopping[]){
		System.out.println("The main Started");
		String val1 = signIn(1235364789, "123Binay");
		String val = signIn("Bilwesh", "123Binay");
		System.out.println(val);
		System.out.println(val1
		
		System.out.println("========================");
		boolean ref  = signUp("Bilwesh", 12353364789l, "123Binay");
		System.out.println("The Sign Up Successfull "+ref);
		System.out.println("The main Ended");
	}
	
	public static String signIn(long phoneNumber, String password){
		String msg = null;
		System.out.println("The method  started");
		if(phoneNumber > 0 || password != null){
			System.out.println("PhoneNumber/password is Checked");
			msg = "The Successfully signed";
		}
		else{
			System.out.println("PhoneNumber/Password is UnChecked");
			msg = "Please check the PhoneNumber/Password";
		}
		System.out.println("The method Ended");
		return msg;
	}
	
	public static String signIn(String username, String password){
		String msg = null;
		System.out.println("Te method overloading started");
		if(username != null || password != null){
			System.out.println("Username/Password is Checked");
			msg = "The Successfull signed";
		}
		else{
			System.out.println("Username/Password is UnChecked");
			msg = "Pleasecheck the Username/Password";
		}
		System.out.println("The methos Ended");
		return msg;
	}
	
	public static boolean signUp(String yourName, long phoneNumber, String password){
		System.out.println("Your Name : "+yourName);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Password : "+password);
		return true;
	}
}