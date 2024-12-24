class StudentRunner{
	
	public static void main(String cal[]){
		int arr[]={99,98,100,97};
		Student student1 = new Student("Rahul",arr);
		student1.display();
		average(arr);
		maxMarks(arr);
		
	}
	public static void average(int array[]){
		float sum=0;
		for(int index=0;index<array.length;index++){
			sum=sum+array[index];
		}
		float avg= sum/array.length;
		System.out.println("The average is "+avg);
	}
	public static void maxMarks(int array[]){
		int maxi=array[0];
		for(int index=0;index<array.length;index++){
			if(array[index]>maxi){
				maxi=array[index];
			}
		
		}
		System.out.println("The maximum marks obtained is "+maxi);
		
	}
	
	
}