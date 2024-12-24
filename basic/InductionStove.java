class InductionStove{
	static boolean isOn;
	static int maxHeat = 5;
	static int currentHeat;
	public static void main(String stove[]){
		onStove();
		stoveHeat();
		stoveHeat();
		stoveHeat();
		stoveHeat();
		stoveHeat();
		stoveHeat();
		stoveHeat();
		onStove();
	}
	
	public static boolean onStove(){
		if(isOn == false){
			isOn = true;
			System.out.println("The Stove is On");
		}
		else{
			System.out.println("The Stove is Off");
		}
		return isOn;
	}
	
	public static void stoveHeat(){
		if(isOn == true){
			if(currentHeat < maxHeat){
				currentHeat = currentHeat + 1;
				System.out.println("The Stove Heat "+currentHeat);
			}
			else{
				System.out.println("The Stove maxHeat");
			}
		}
		else{
			System.out.println("Switch on the stove");
		}
	}
	
}