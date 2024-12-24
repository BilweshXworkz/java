class PrimeVideo{

	static String hindiMovies[]={"Stree","Javaan","Tiger","Fighter","Dear Jindagi"};
	static String kannadaMovies[]={"Bedara Kannappa","Nagarahavu","Malgudi Days","Majestic","Kiccha","A", "ASN","KGF","Kantara"};
	static String englishMovies[]={"Red Notice", "Inception", "Lala land","God Father", "Cinema Paradise"};
	static String tamilMovies[]={"Jailer","Vikram","Raayan", "GOAT","Leo","Coolie"};
	static String malayalamMovies[]={"Premam","Kumbalangi Nights","Trance", "Hotel Usthad", "Irattu", "Joji"};
	static String teluguMovies[]={"Aarya", "Arjun Reddy","Shreemanthudu","RRR","Magadheera"};
public static void main(String a[]){

	System.out.println("Hindi Movies are : ");
	for(int hindi=hindiMovies.length-1;hindi>=0;hindi--){
	String ref = hindiMovies[hindi];
	System.out.print(ref+",");
	}
	System.out.println("\n");

	System.out.println("Kannada Movies are: ");
	for(int hello=kannadaMovies.length-1;hello>=0;hello--){
		String ref = kannadaMovies[hello];
		System.out.print(ref+", ");
		
	}
	System.out.println("English movies are: ");
	for(int app=englishMovies.length-1;app>=0;app--){
		String ref = englishMovies[app];
		System.out.print(ref+", ");
		
	}
	System.out.println("\n");
	System.out.println("Tamil movies are: ");
	for(int earth =tamilMovies.length-1; earth>=0;earth--){
		String ref= tamilMovies[earth];
		System.out.print(ref+", ");
	}
	System.out.println("\n");
	System.out.println("Malayalam movies are: ");
	for(int eno=malayalamMovies.length-1;eno>=0;eno--){
		String ref = malayalamMovies[eno];
		System.out.print(ref+", ");
	}
	System.out.println("\n");
	System.out.println("Telugu movies are: ");
	for(int apple=teluguMovies.length-1;apple>=0;apple-- ){
		//String ref= teluguMovies[apple];
		System.out.print(teluguMovies[apple]+"  ");
	}
	System.out.println("\n");
}


}