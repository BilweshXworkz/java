class Dominos{

public static void main(String a[]){
	
	String pizza[]={"Margherita","Farm House","Peppy Paneer","Mexican Green Wave","Deluxe Veggie","Cheese N Corn","Veggie Paradise","Paneer Makhani","Indi Tandoori Paneer","Achari Do Pyaza","Fresh Veggie","Veg Extraveganza","Double Cheese Margherita","The 4 Cheese Pizza","Moroccan Spice Pasta Pizza-Veg "};
System.out.println("Pizza :");
// System.out.println(pizza[0]+" || "+pizza[1]+" || "+pizza[2]+" || "+pizza[3]+" || "+pizza[4]+" || "+pizza[5]+" || "+pizza[6]+" ||"+pizza[7]+" || "+pizza[8]+
// " || "+pizza[9]+" || "+pizza[10]+" ||\n "+pizza[11]+" || "+pizza[12]+" || "+pizza[13]+" || "+pizza[14]);
for(int eno=0;eno<pizza.length;eno++){
	String ref = pizza[eno];
	System.out.println(ref);
}
}

}