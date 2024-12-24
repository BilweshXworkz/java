class SportsMania{
public static void main(String a[]){

String top10OdiMenTeams[]={"India","Australia","South Africa","Pakistan","NewZealand",
						"Srilanka","England","bangladesh","Afghanistan","West Indies"};
						
String top10OdiWomenTeams[]={"Australia","England","South Africa","India","New Zealand","Srilanka",
							"West Indies","Bangladesh","Thailand","Pakistan"};
							
String top10FootBallTeam[]={"Argentina","France","Spain","England","Brazil",
							"Belgium","Netherlands","Portugal","Columbia","Italy"};
							
String top10MenInCricket[]={"Babar Azam","Rohith Sharma","Shubman Gill","Virat Kohli","Harry Tector","Darly Mitchell",
							"David Warner","Pathum Nissanka","Dawid Malan","Rassie Van Der Dussen"};
							
String top10WomenInCricket[]={"Sciver Brunt","Laura Wolvaardt","Smriti Mandhana",
							"Chamari Athapaththu","Beth Mooney","Ellyse Perry","Marizanne Kapp","Alyssa Healy","Harmanpreeth Kaur","Hayley Matthews"};
System.out.println();
System.out.println("The top 10 men's team:");
System.out.println("------------------------");
for(int team=0;team<top10OdiMenTeams.length;team++){
	
	String ref = top10OdiMenTeams[team];
	System.out.println(team+1+"."+ref);
							
}
System.out.println("");
System.out.println("The top 10 women's team:");
System.out.println("------------------------");
for(int group=0;group<top10OdiWomenTeams.length;group++){
	String ref = top10OdiWomenTeams[group];
	System.out.println(group+1+"."+ref);
	
}
System.out.println();
System.out.println("The top 10 Football team:");
System.out.println("-------------------------");
for(int run=0;run<top10FootBallTeam.length;run++){
	String ref = top10FootBallTeam[run];
	System.out.println(run+1+"."+ref);
	
}
System.out.println();
System.out.println("The top 10 men's ODI batting rankings:");
System.out.println("--------------------------------------");
for(int top=0;top<top10MenInCricket.length;top++){
	String ref = top10MenInCricket[top];
	System.out.println(top+1+"."+ref);
	
}
System.out.println();
System.out.println("The top 10 women's batting rankings:" );
System.out.println("------------------------------------");
for (int rank=0;rank<top10WomenInCricket.length;rank++){
		String ref = top10WomenInCricket[rank];
		System.out.println(rank+1+"."+ref);
}


}
}