class SportifyRunner{
	public static void main(String a[]){
		Sportify.addSongName("Nee Nanna Olavu");
		Sportify.addSongName("Kho Gaye Hum Kahan");
		Sportify.addSongName("Love You Zindagi");
		Sportify.addSongName("Sojugada Sooju Mallige");
		Sportify.addSongName("Kho Gaye Hum Kahan");
		Sportify.addSongName("Mugulu Nage");
		Sportify.addSongName("Singara Siriye");
		Sportify.addSongName("Kavithe Kavithe");		
		Sportify.getSongNames();
		System.out.println("-------------------");
		boolean isUpdate=Sportify.updateSongName("Kho Gaye Hum Kahan","Ugram veeram");
		System.out.println("Is the song name updated : "+isUpdate);		
		Sportify.getSongNames();
		System.out.println("---------------------");
		Sportify.deleteSongName("Mugulu Nage");
		Sportify.getSongNames();
		
	}
}