class Hotel{

public static void main(String a[]){

	String hotBeverages[]={"Coffee/Tea","Hot Badam Milk","Cold Badam Milk","Lemon Tea","Horlicks"};
	String southIndianDishes[]={"Idly","Vada","Akki/Raagi Rotti","Masala Dosa","Bisibelebath","Poori Saagu","Rice Bath"};
	String meals[]={"South Indian Meals","North Indian Meals","Mini Meals"};
	String starters[]={"Gobbi Manchurian","Baby Corn Manchurian","Mushroom Manchurian","Paneer 65","Paneer Pepper Dry","Finger Chips"};
	
	System.out.println();
	System.out.println("--------------Menu-------------");
	System.out.println();
	System.out.println("Hot Beverages");
	System.out.println("--------------");
	for(int cafin=0;cafin<hotBeverages.length;cafin++){
	String ref = hotBeverages[cafin];
	System.out.println(ref);
	}
System.out.println();
System.out.println("South Indian Dishes");
System.out.println("-------------------");
for(int breakfast=0;breakfast<southIndianDishes.length;breakfast++){
	String ref = southIndianDishes[breakfast];
	System.out.println(ref);
}
System.out.println();
System.out.println("Meals");
System.out.println("--------------");
for(int full=0;full<meals.length;full++){
	String ref = meals[full];
	System.out.println(ref);
}
System.out.println();
System.out.println("Starters");
System.out.println("--------------");
for(int junk=0;junk<starters.length;junk++){
	String value = starters[junk];
	System.out.println(value);
}
}
}