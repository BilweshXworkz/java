import java.util.*;
class Theatre{
	static String movies[]={null, null, null, null, null, null, null, null, null, null, null, null, null, null,null};
	static int initial;
	
	public static void addMovie(String movie){
		if(movie!=null){
			movies[initial++]=movie;
		}else{
			System.out.println("null is set as default.");
		}
		
	}
	public static void getMovies(){
		for(String movie: movies){
			System.out.println(movie);
		}
	}
	
	public static boolean updateMovieName(String oldMovieName, String newMovieName){
		boolean isUpdate=false;
		for(int initial=0; initial<movies.length;initial++){
			if(movies[initial]==oldMovieName){
				movies[initial]=newMovieName;
				isUpdate=true;
				break;
			}
		}
		if(isUpdate==false) System.out.println(oldMovieName+" is not found.");
		return isUpdate;
	}
	
	public static boolean deleteMovieName(String value){
		boolean isDeleted=false;
		int start, first;
		for(start=0,first=0;start<movies.length;start++){
			if(movies[start]!=value){
				movies[first++]=movies[start];
			}else isDeleted=true;
		}
		movies=Arrays.copyOf(movies,first);
		return isDeleted;
	}
}