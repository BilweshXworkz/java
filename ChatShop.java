class ChatShop{

public static void main(String a[]){
 String chats[]={"Pani puri","Masala puri","Bhel puri","Sev puri","Dahi puri","Samosa","Kachowri","Vada Pav", "Pav bhaji"};
 //System.out.println("The chats available are :\n"+chats[0]+" || "+chats[1]+" || "+chats[2]+" || "+chats[3]+" || "+chats[4]+" || \n"+chats[5]+" || "+chats[6]+" || "+chats[7]+" || "+chats[8]+" .");
 for(int start=0;start<chats.length;start++){
	 String ref=chats[start];
	 System.out.print("<|"+ref+"|> ");
 }




}
}