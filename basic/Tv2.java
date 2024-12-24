class Tv2{
	static int max = 10;
	static int min = 1;
	static int current;
	static boolean isconnected;
	
	public static void main(String tel[]){
		onOrOff();
		if(onOrOff == true)
		for(int set=min; set < max; set++){
			increase();
		}
		System.out.println("================");
		for(int set=current; set>min; set--){
			decrease();
		}
		
		onOrOff();
		
	}
	
	public static boolean onOrOff(){
		if(isconnected == false){
			isconnected = true;
			System.out.println("On "+isconnected);
		}
		else{
			isconnected = false;
			System.out.println("Off "+isconnected);
		}
		return isconnected;
	}
	
	public static void increase(){
		if(isconnected == true){
			if(max > current){
				current = current + 1;
				System.out.println("The increase "+current);
			}
			else{
				System.out.println("The TV is max");
			}
		}
		else{
			System.out.println("Switch on the System");
		}
	}
	
	public static void decrease(){
		if(isconnected == true){
			if(min < current){
				current = current - 1;
				System.out.println("The decrease "+current);
			}
			else{
				System.out.println("The TV is Low ");
			}
		}
		else{
			System.out.println("Switch on the ");
		}
	}
}