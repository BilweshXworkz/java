class ZeptoRunner{

public static void main(String a[]){
 String foodAvailable="Onion";
  //String foodAvailable="Potato";
 double price=Zepto.search(foodAvailable);
 price=Zepto.search(foodAvailable, 4);
 System.out.println("The price of "+foodAvailable+" is "+price );

}
}