class Caluator{
	public static void main(String[] calculator){
		System.out.println("The Started main");
		//invoke
		add(89,74);
		add(79,103);
		sub(89,74);
		sub(103,79);
		mul(89,74);
		mul(103,79);
		div(89,74);
		div(103,79);
		mod(89,74);
		mod(103,79);
		System.out.println("The End main ");
	}
	
	public static void add(int num1, int num2){
		int total = num1 + num2;
		System.out.println(num1+" + "+num2+" = "+total);
	}
	
	public static void sub(int num1, int num2){
		int total = num1 - num2;
		System.out.println(num1+" - "+num2+" = "+total);
	}
	
	public static void mul(int num1, int num2){
		int total = num1 * num2;
		System.out.println(num1+" X "+num2+" = "+total);
	} 
	
	public static void div(int num1, int num2){
		int total = num1 / num2;
		System.out.println(num1+" / "+num2+" = "+total);
	}
	
	public static void mod(int num1, int num2){
		int total = num1 % num2;
		System.out.println(num1+" % "+num2+" = "+total);
	}
}