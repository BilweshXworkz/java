class Netflix{
	static String hindiMovies[] = {"Stree", "Taare Zameen Par"};
	static String koreanMovies[] = {"All of us are dead", "The PentHouse"};
	static String kannadaMovies[] = {"KGF", "H2O", };
	static String englishMovies[] = {"Interstelas", "Fast & Furios"};
	
	public static void main(String movies[]){
		System.out.println("The Kannada Movies");
		for(int start=kannadaMovies.length-1; start>=0; start--){
			String my = kannadaMovies[start];
			System.out.println(my);
		}
		System.out.println("========================");
		System.out.println("The English Movies");
		for(int start = englishMovies.length-1; start>=0; start--){
			String eng = englishMovies[start];
			System.out.println(eng);
		}
		System.out.println("===========================");
		System.out.println("The Hindi Movies");
		for(int start = hindiMovies.length-1; start>=0;start--){
			String hindi = hindiMovies[start];
			System.out.println(hindi);
		}
		System.out.println("======================");
		System.out.println("The Korean Movies");
		for(int start=koreanMovies.length-1; start>=0; start--){
			String korean = koreanMovies[start];
			System.out.println(korean);
		}
		
	}
}