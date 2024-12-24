import java.util.Arrays;

class Sportify{
	static String songNames[]={null, null, null, null, null, null, null, null};
	static int first;
	public static void addSongName(String songName){
		songNames[first++]=songName;
	}
	
	public static void getSongNames(){
		for(String songName:songNames){
			System.out.println(songName);
		}
	}
	
	public static boolean updateSongName(String oldSongName, String newSongName){
		boolean isUpdate=false;
		for(int initial=0;initial<songNames.length;initial++){
			if(songNames[initial]==oldSongName){
				songNames[initial]=newSongName;
				isUpdate=true;
				break;
			}
		}
		if(isUpdate==false) System.out.println(newSongName+" not found.");
		return isUpdate;	
	}
	
	public static void deleteSongName(String value){
		int begin,first;
		for(begin=0,first=0;begin<songNames.length;begin++){
			if(songNames[begin]!=value){
				songNames[first++]=songNames[begin];
			}else System.out.println(value+" is not found.");
		}
		songNames=Arrays.copyOf(songNames, first);
	}
}