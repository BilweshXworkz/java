import java.util.Arrays;
class PhonePe{
	static String insurances[] = {null, null, null, null, null};
	static int start ;
	
	public static void addInsurance(String insurance){
		if(insurance!=null){
			insurances[start++]= insurance;
		}else{
			System.out.println("null is set as default");
		}
	}
	
	public static void getInsurances(){
		for(String insurance:insurances){
			System.out.println(insurance);
		}
	}
	public static boolean updateInsurance(String oldInsurance, String newInsurance){
		boolean isUpdate=false;
		for(int begin =0;begin<insurances.length;begin++){
			if(insurances[begin]==oldInsurance){
				insurances[begin]=newInsurance;
				isUpdate=true;
				break;
			}
		}
		if(isUpdate==false) System.out.println(oldInsurance+" is not found.");
		return isUpdate;
	}
	
	public static boolean deleteInsurance(String value){
		boolean isDeleted=false;
		int index, position;
		for(index=0,position=0;index<insurances.length;index++){
			if(insurances[index]!=value){
				insurances[position++]=insurances[index];
			}else isDeleted=true;
		}
		insurances=Arrays.copyOf(insurances,position);
		return isDeleted;
	}
	
}