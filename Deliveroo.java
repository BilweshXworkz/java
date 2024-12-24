class Deliveroo{


public static double search(String foodAvailable){
	double price=0.0;
	if(foodAvailable=="Daily seasonings mix"){
		price= 229;
	}
	else if(foodAvailable=="Toor dal"){
		price= 236;
	}
	else if(foodAvailable=="Urad dal"){
		price= 118;
	}
	else if(foodAvailable=="MP atta"){
		price= 485;
	}
	else if(foodAvailable=="Basmati rice"){
		price= 359;
	}
	else if(foodAvailable=="Masoor dal"){
		price= 79;
	}
	else if(foodAvailable=="Masoori raw rice"){
		price= 389;
	}
	else if(foodAvailable=="Sharbati atti"){
		price= 333;
	}
	else if(foodAvailable=="Ground nut"){
		price= 99;
	}
	else if(foodAvailable=="Besan"){
		price= 73;
	}
	else if(foodAvailable=="Chana dal"){
		price= 74;
	}
	else if(foodAvailable=="Rice flour"){
		price= 35;
	}
	else if(foodAvailable=="Mixed pickle"){
		price= 105;
	}
	else if(foodAvailable=="Suji rawa"){
		price= 32;
	}
	else if(foodAvailable=="Thick poha"){
		price= 95;
	}
	else{
	//return price;
   System.out.println(foodAvailable+" not found");

}
return price;
}

public static double search(String foodAvailable, int quantity){
	double price=0.0;
if(foodAvailable=="Daily seasonings mix"){
price= 229*quantity;
}
else if(foodAvailable=="Toor dal"){
price= 236*quantity;
}
else if(foodAvailable=="Urad dal"){
price= 118*quantity;
}
else if(foodAvailable=="MP atta"){
price= 485*quantity;
}
else if(foodAvailable=="Basmati rice"){
price= 359*quantity;
}
else if(foodAvailable=="Masoor dal"){
price= 79*quantity;
}
else if(foodAvailable=="Masoori raw rice"){
price= 389*quantity;
}
else if(foodAvailable=="Sharbati atti"){
price= 333*quantity;
}
else if(foodAvailable=="Ground nut"){
price= 99*quantity;
}
else if(foodAvailable=="Besan"){
price= 73*quantity;
}
else if(foodAvailable=="Chana dal"){
price= 74*quantity;
}
else if(foodAvailable=="Rice flour"){
price= 35*quantity;
}
else if(foodAvailable=="Mixed pickle"){
price= 105*quantity;
}
else if(foodAvailable=="Suji rawa"){
price= 32*quantity;
}
else if(foodAvailable=="Thick poha"){
price= 95*quantity;
}
else{
System.out.println(foodAvailable+" not found");

}
return price;
}
}