class Student{
	
	String name;
	int marks[];
	
	public Student(String name,int marks[]){
		this.name=name;
		this.marks=marks;
	}
	public void display(){
		System.out.println("The student name is "+name);
		System.out.println("The student marks are: ");
		for(int value:(this.marks)) System.out.print(value+" ");
		System.out.println();		
	}
	

}