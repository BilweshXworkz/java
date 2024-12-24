class Practice{
	
/* static String foodName= "vada";
 static boolean elseCondition;
 
public static void main(String a[]) {

String price;
//String foodName ="Dosa";

price=search(foodName);
if(elseCondition==true){
	 System.out.println( price);
 }else{
System.out.println("The price of "+foodName+" is "+price);

}

}

 public static String search(String foodName) {
	 //String foodName;
	// foodName=foodName.toLowerCase();
	//  System.out.println(foodName);



 if(foodName=="Dosa"){
	  System.out.println(foodName);

 //return 65.87;
  return "65.87";

 }
 if(foodName=="Idly"){
	//  return 30.00;
 return "30.00";
 }
 if(foodName=="Vada"){
// return 20;
  return "20";

 }
 if(foodName=="Veg pulav"){
	// return 60.67;  
 return "60.67";
 }
 else{
	 

	 elseCondition=true;
	 
 

 return(foodName+" not found ");
  //return 0.0;
  

 }
 
*/

public static void main(String a[]){
 String foodAvailable="Meghana special biriyani";
 double price=search("Meghana special biriyani");
 System.out.println("The price of "+foodAvailable+" is "+price );

}
public static double search(String foodAvailable){
if(foodAvailable=="Non veg biriyani rice"){
return 265;
}
if(foodAvailable=="Chicken biriyani"){
return 350;
}
if(foodAvailable=="Chicken boneless biriyani"){
return 360;
}
if(foodAvailable=="Meghana special biriyani"){
return 370;
}
if(foodAvailable=="Aloo dum biriyani"){
return 315;
}
if(foodAvailable=="Paneer biriyani"){
return 365;
}
if(foodAvailable=="Veg biriyani rice"){
return 260;
}
if(foodAvailable=="Spl veg biriyani"){
return 330;
}
if(foodAvailable=="Mushroom biriyani"){
return 365;
}
if(foodAvailable=="Chicken fry pc biriyani"){
return 375;
}
if(foodAvailable=="Lollipop biriyani"){
return 360;
}
if(foodAvailable=="Mutton keema biriyani"){
return 470;
}
if(foodAvailable=="Fish biriyani"){
return 445;
}
if(foodAvailable=="Prawns biriyani"){
return 460;
}
if(foodAvailable=="Egg biriyani"){
return 320;
}
else{
System.out.println(foodAvailable+" not found");
return 0.0;
}

}



}