class DeliverooRunner{

public static void main(String a[]){
 String foodAvailable="Besan";
 // String foodAvailable="Chips";
 double price=Deliveroo.search(foodAvailable,3);
 System.out.println("The price of "+foodAvailable+" is "+price );

}
}