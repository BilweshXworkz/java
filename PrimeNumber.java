
class PrimeNumber{
	
	
	public static boolean primeOrNot(int number){
		boolean isPrime=false;
		if(number==2){
			isPrime=true;
			return isPrime;
		}
		for(int start =2;start<Math.sqrt(number);start++){
			if(number%start == 0){
				isPrime=true;
				break;						
			}
		}
	if(isPrime==false) System.out.println(number+" is not a prime number.");
	return isPrime;
	}
}