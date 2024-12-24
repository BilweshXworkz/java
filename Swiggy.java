class Swiggy{
 

 static boolean elseCondition;
 public static double search(String foodName) {
 if(foodName=="Dosa"){
	return 65.87;
 }
 if(foodName=="Idly"){
	 return 30.00;
 }
 if(foodName=="Vada"){
	return 20;
 }
 if(foodName=="Veg Pulav"){
	return 60.67;
 }
 if(foodName=="Baby corn manchurian"){
	 return 215;
 }
 if(foodName=="Veg fried rice"){
	 return 160;
 }
 if(foodName=="Gobi manchurian"){
	 return 160;
 }
 if(foodName=="North indian mini meals"){
	 return 140;
 }
 if(foodName=="Veg biriyani"){
	 return 195;
 }
 if(foodName=="Curd rice"){
	 return 100;
 }
 if(foodName=="Tomato soup"){
	 return 85;
 }
 if(foodName=="Schezwan biriyani"){
	 return 200;
 }
 if(foodName=="Aloo parotta"){
	 return 70;
 }
 if(foodName=="Paneer fried rice"){
	 return 230;
 }
 if(foodName=="Jain jeera rice"){
	 return 195;
 }
 else{	 
	 elseCondition=true;
    System.out.println(foodName+" not found");
	 return 0;
 }
 }
public static double search(String foodName, int quantity){
	 if(foodName=="Dosa"){
	return 65.87*quantity;
 }
 if(foodName=="Idly"){
	 return 30.00*quantity;
 }
 if(foodName=="Vada"){
	return 20*quantity;
 }
 if(foodName=="Veg Pulav"){
	return 60.67*quantity;
 }
 if(foodName=="Baby corn manchurian"){
	 return 215*quantity;
 }
 if(foodName=="Veg fried rice"){
	 return 160*quantity;
 }
 if(foodName=="Gobi manchurian"){
	 return 160*quantity;
 }
 if(foodName=="North indian mini meals"){
	 return 140*quantity;
 }
 if(foodName=="Veg biriyani"){
	 return 195*quantity;
 }
 if(foodName=="Curd rice"){
	 return 100*quantity;
 }
 if(foodName=="Tomato soup"){
	 return 85*quantity;
 }
 if(foodName=="Schezwan biriyani"){
	 return 200*quantity;
 }
 if(foodName=="Aloo parotta"){
	 return 70*quantity;
 }
 if(foodName=="Paneer fried rice"){
	 return 230*quantity;
 }
 if(foodName=="Jain jeera rice"){
	 return 195*quantity;
 }
 else{	 
	 elseCondition=true;
    System.out.println(foodName+" not found");
	 return 0.0;
	 
 }
   
 }
}
