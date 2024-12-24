import java.util.Arrays;

class Olympics{
	static String sportNames[]={null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int first;
	public static void addSportName(String sportName){
		if(sportName!=null){
			sportNames[first++]=sportName;
		}
		else{
			System.out.println("Null is set as default");
		}		
	}
		
	public static void getSportNames(){
		for(String sportName:sportNames){        //for each is about local variables
		
			System.out.println(sportName);
		}
	}
	public static boolean updateSportName(String oldName, String newName){
		boolean isEdit=false;
		for(int position=0;position<sportNames.length;position++){
			if(sportNames[position]==oldName){
				sportNames[position]=newName;
				isEdit=true;
				break;
			}
		}
		if(isEdit==false) System.out.println(oldName+" is not found.");
		return isEdit;
	}
	public static boolean  deleteSportName(String name){
		boolean isDeleted=false;
		int position,start;
		for(position=0, start=0;position<sportNames.length;position++){
			if(sportNames[position]!=name){
				sportNames[start++]=sportNames[position];
			}else isDeleted=true;
		}
		sportNames=Arrays.copyOf(sportNames, start);
		return isDeleted;
	}
}