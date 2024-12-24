class Fan{
	boolean isConnected=false;
	int maxSpeed;
	int minSpeed;
	int currentSpeed;
	int setSpeed=1;
	
	public Fan(boolean isConnected, int maxSpeed,int minSpeed,int currentSpeed){
		this.isConnected=isConnected;
		this.maxSpeed=maxSpeed;
		this.minSpeed=minSpeed;
		this.currentSpeed=currentSpeed;
	}
	public void onOrOff(){
		if(this.isConnected==false) isConnected=true;
		//question 10.3
		currentSpeed=setSpeed;
		System.out.println("The predefined value is set and it's value is: "+currentSpeed);
	
	}
	// public void increaseSpeed(){
		// while()
	// }
	public void display(){
		System.out.println("Connection on: "+isConnected);
		System.out.println("Maximum speed: "+maxSpeed);
		System.out.println("Minimum speed: "+minSpeed);
		System.out.println("Current speed: "+currentSpeed);
		
	}
}