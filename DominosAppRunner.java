class DominosAppRunner{


public static void main(String a[]){
 String foodAvailable="Veg loaded";
 int quantity=5;
  //String foodAvailable="Harissa dip";
 double price=DominosApp.search(foodAvailable,quantity);
 System.out.println("The price of "+quantity+" "+foodAvailable+" is "+price );

}
}