class GalaxyRunner{
	public static void main(String a[]){
		Galaxy.addPlanetName("Mercury");
		Galaxy.addPlanetName("Venus");
		Galaxy.addPlanetName("Earth");
		Galaxy.addPlanetName("Mars");
		Galaxy.addPlanetName("Jupiter");
		Galaxy.addPlanetName("Saturn");
		Galaxy.addPlanetName("Uranus");
		Galaxy.addPlanetName("Neptune");	
		Galaxy.addPlanetName("Pluto");		
		Galaxy.getPlanetNames();
		System.out.println("---------------------");
		Galaxy.updatePlanetName("Earth","Mother Earth");
		//System.out.println("Is value updated : "+isUpdate);
		Galaxy.getPlanetNames();
		System.out.println("---------------------");
		Galaxy.deletePlanetName("Pluto");
		Galaxy.getPlanetNames();

	}
}