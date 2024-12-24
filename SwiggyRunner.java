class SwiggyRunner{
	//static String foodName= "Vada";
 static String foodName= "Dosa";
 //static String foodName= "Curd ";
 static boolean elseCondition;

public static void main(String a[]) {
double price=Swiggy.search(foodName);

if(elseCondition==true){
	 System.out.println( price);
 }else{
System.out.println("The price of "+foodName+" is "+price);
}
}
}