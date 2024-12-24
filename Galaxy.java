import java.util.Arrays;
class Galaxy{
	static String planetNames[]={null, null, null, null, null, null, null, null,null};
	static int first;
	public static void addPlanetName(String planetName){	
		planetNames[first++]=planetName;
	}
	
	public static void getPlanetNames(){
		for(String planetName:planetNames){ 
			System.out.println(planetName);
		}
	}
	public static void updatePlanetName(String oldPlanetName, String newPlanetName ){
		for(int start =0;start<planetNames.length;start++){
			if(planetNames[start]==oldPlanetName){
				planetNames[start]=newPlanetName;
			}
		}
	}
	
	public static void deletePlanetName(String name){
		int index,begin;
		for(index=0, begin=0;index<planetNames.length;index++){
			if(planetNames[index]!=name){
				planetNames[begin++]=planetNames[index];
			}else System.out.println(name+" is not found.");
		}
		planetNames=Arrays.copyOf(planetNames, begin);
	}
}