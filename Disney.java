class Disney{

public static void main(String a[]){

String englishSeries[]={"Peaky Blinders","Sherlock","Game of Thrones","The Mentalist","Breaking Bad","Money Heist"};
String anime[]={"Death Note", "Monster","Naruto","Attack on Titan","One Piece"};
String cartoon[]={"Avtar:The Last Airbender","Batman","Samurai Jack","Ben 10","Family Guy"};

System.out.println();
System.out.println("---------Disney presents: Watch before you Die---------");
System.out.println("English Series ");
System.out.println("---------------");
for(int series=0;series<englishSeries.length;series++){
	String data = englishSeries[series];
	System.out.println(series+1+"."+data);
}
System.out.println();
System.out.println("Anime");
System.out.println("---------------");
for(int action=0;action<anime.length;action++){
	String ref = anime[action];
	System.out.println(action+1+"."+ref);
}
System.out.println();
System.out.println("Cartoon");
System.out.println("----------------");
for(int child=0;child<cartoon.length;child++){
	String value = cartoon[child];
	System.out.println(child+1+"."+value);
}

}

}