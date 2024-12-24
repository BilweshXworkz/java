class Factorial{

public static void main(String a[]){

System.out.println("main function starts here");
int factorialNumber=5;
int fact=1;
// for(int ref=1;ref<=factorialNumber;ref++){
	// fact=fact*ref;
// }
for(int val=factorialNumber;val>=1;val--){
	fact=fact*val;
}

System.out.println("The factorial of "+factorialNumber+" is "+fact); 

System.out.println("main function ends here");



}


}