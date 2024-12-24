class OlympicsRunner{
	public static void main(String a[]){
		Olympics.addSportName("Gymnastics");
		Olympics.addSportName("Badminton");
		Olympics.addSportName("Archery");
		Olympics.addSportName("Weightlifting");
		Olympics.addSportName("Tennis");
		Olympics.addSportName("Boxing");
		Olympics.addSportName("Fencing");
		Olympics.addSportName("Track and field");
		Olympics.addSportName("Shooting");
		Olympics.addSportName("Wrestling");
		Olympics.addSportName("Golf");
		Olympics.addSportName("Taekwondo");
		Olympics.addSportName("Athletics");
		Olympics.addSportName("Rowing");
		Olympics.addSportName("Equestrian");
		//Olympics.addSportName("Equestrian");				
		Olympics.getSportNames();
		System.out.println("---------------------");
		boolean isUpdate=Olympics.updateSportName("Golf", "Swimming");
		System.out.println("Is the value edited : "+isUpdate);
		Olympics.getSportNames();
		System.out.println("---------------------");
		isUpdate=Olympics.deleteSportName("Taekwondo");
		System.out.println("Is the value deleted : "+isUpdate);
		Olympics.getSportNames();
	}
}