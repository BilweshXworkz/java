11. Arrays are the containers that are used to store data of similar types in single reference.

class ArrayProblems{
	static int price[]={225, 337, 179, 217, 83, 435, 313, 420, 108, 120, 101, 143, 90, 35};
	 static int index;
	 public static void main(String a[]){
		 for(int start=0; start<price.length; start++){
			 if(price[start]<250){
				 int ref=price[start];
				 System.out.print(ref+" ");
				 
			 }
			 
		/*	if(price[start]>400){
				 int ref=price[start];
				 System.out.print(ref+" ");
				 ref=ref+20;
				 System.out.print(ref+" ");
				 System.out.println();			 
			 } 
			 
			 if(price[start]<100){
				 int ref=price[start];
				 System.out.print(ref+" ");
				 ref=ref*50;
				 System.out.print(ref+" ");
				  System.out.println();	
			 } 
			 
			 if(price[start]==420){
				 int ref=price[start];
				 ref=ref-277;
				 System.out.println(ref);
			 }
			 */
		 }   
	 }
}