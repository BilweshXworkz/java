class Bread {
	String brandName;
	int noOfSlices;
	String type;
	
	Bread(String name, int num, String typ){
		 brandName=name;
		 noOfSlices=num;
		 type=typ;
	}
	public void display(){
		System.out.println("Brand name is "+brandName);
		System.out.println("Number of slices are "+noOfSlices);
		System.out.println("The type of bread is "+type);
	}
}