class Facebook{
public static void login(String email, String password){
	if(email=="prajwal@gmail.com" && password=="hello123"){
	System.out.println("Login successful");
	}
	else{
		if(email=="prajwal@gmail.com" && password!="hello123"){
			System.out.println("Incorrect password");
		}
		else if(email!="prajwal@gmail.com" && password=="hello123"){
			System.out.println("Incorrect email");
		}
		else {
			System.out.println("User unknown!! Please regester");
		}
	
	}


}

public static void login(long mobileNumber, String password){
	if(mobileNumber==7019592845l && password=="hello123"){
	System.out.println("Login successful");
	}
	else{
		if(mobileNumber==7019592845l && password!="hello123"){
			System.out.println("Incorrect password");
		}
		else if(mobileNumber!=7019592845l && password=="hello123"){
			System.out.println("Incorrect mobile number");
		}
		else {
			System.out.println("User unknown!! Please regester");
		}
	
	}


}
}