class Permutation{

public static void main(String a[]){

	int n=5,r=2;
	int x=n-r;
	int nValue=1;
	for(int ref=1;ref<=n;ref++){
	
	nValue= nValue*ref;
	
	}
	int xValue=1;
	 for(int val=1;val<=x;val++){
		 
			xValue=xValue*val;
	 }
	 
	 int  nPr=nValue/xValue;
	 System.out.println("The value of "+n+"P"+r+" is "+nPr);
	
	


}


}
