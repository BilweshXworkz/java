class SportsShop{

public static void main(String a[]){

String items[]={"Badminton Racquet","Chess board","Ski","Ski Poles","Basketball","Handball","Football","Archery","Baseball","Cricket bat","Cricket ball","Bails","Cricket Stumps","Dart board","Discus disc "};
System.out.println("Sports Items :");
// System.out.println(items[0]+" || "+items[1]+" || "+items[2]+" || "+items[3]+" || "+items[4]+" || "+items[5]+" || "+items[6]+" ||"+items[7]+" ||\n "+items[8]+
// " || "+items[9]+" || "+items[10]+" || "+items[11]+" || "+items[12]+" || "+items[13]+" || "+items[14]);
for(int play=0;play<items.length;play++){
	String ref = items[play];
	System.out.println(ref);
}
}


}