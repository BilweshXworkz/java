class TheatreRunner{
	public static void main(String a[]){
		Theatre.addMovie("Robert");
		Theatre.addMovie("KGF");
		Theatre.addMovie("Beast");
		Theatre.addMovie("Vaarisu");
		Theatre.addMovie("Love Moctail 2");
		Theatre.addMovie("RRR");
		Theatre.addMovie("Dhoomam");
		Theatre.addMovie("Charlie 777");
		Theatre.addMovie("James");
		Theatre.addMovie("Hostel Hudugaru");
		Theatre.addMovie("Khabza");
		Theatre.addMovie("Kaatera");
		Theatre.addMovie("Vikranth Rona");
		Theatre.addMovie("Kashmiri Files");
		Theatre.addMovie("The Kerala Story");
		//Theatre.addMovie("");
		Theatre.getMovies();
		//System.out.println("---------------------");
		boolean isUpdate=Theatre.updateMovieName("Khabza","Kranti");
		System.out.println("---------------------");
		System.out.println("Is the value updated : "+isUpdate);
		System.out.println("---------------------");
		Theatre.getMovies();
		System.out.println("---------------------");
		isUpdate=Theatre.deleteMovieName("Kranti");
		System.out.println("Is the value deleted : "+isUpdate);
		System.out.println("---------------------");
		Theatre.getMovies();
	}

}