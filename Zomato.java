class Zomato{


public static double search(String foodAvailable){
if(foodAvailable=="Non veg biriyani rice"){
return 265;
}
if(foodAvailable=="Chicken biriyani"){
return 350;
}
if(foodAvailable=="Chicken boneless biriyani"){
return 360;
}
if(foodAvailable=="Meghana special biriyani"){
return 370;
}
if(foodAvailable=="Aloo dum biriyani"){
return 315;
}
if(foodAvailable=="Paneer biriyani"){
return 365;
}
if(foodAvailable=="Veg biriyani rice"){
return 260;
}
if(foodAvailable=="Spl veg biriyani"){
return 330;
}
if(foodAvailable=="Mushroom biriyani"){
return 365;
}
if(foodAvailable=="Chicken fry pc biriyani"){
return 375;
}
if(foodAvailable=="Lollipop biriyani"){
return 360;
}
if(foodAvailable=="Mutton keema biriyani"){
return 470;
}
if(foodAvailable=="Fish biriyani"){
return 445;
}
if(foodAvailable=="Prawns biriyani"){
return 460;
}
if(foodAvailable=="Egg biriyani"){
return 320;
}
else{
System.out.println(foodAvailable+" not found");
}
return 0.0;
}

public static double search(String foodAvailable, int quantity){
if(foodAvailable=="Non veg biriyani rice"){
return 265*quantity;
}
if(foodAvailable=="Chicken biriyani"){
return 350*quantity;
}
if(foodAvailable=="Chicken boneless biriyani"){
return 360*quantity;
}
if(foodAvailable=="Meghana special biriyani"){
return 370*quantity;
}
if(foodAvailable=="Aloo dum biriyani"){
return 315*quantity;
}
if(foodAvailable=="Paneer biriyani"){
return 365*quantity;
}
if(foodAvailable=="Veg biriyani rice"){
return 260*quantity;
}
if(foodAvailable=="Spl veg biriyani"){
return 330*quantity;
}
if(foodAvailable=="Mushroom biriyani"){
return 365*quantity;
}
if(foodAvailable=="Chicken fry pc biriyani"){
return 375*quantity;
}
if(foodAvailable=="Lollipop biriyani"){
return 360*quantity;
}
if(foodAvailable=="Mutton keema biriyani"){
return 470*quantity;
}
if(foodAvailable=="Fish biriyani"){
return 445*quantity;
}
if(foodAvailable=="Prawns biriyani"){
return 460*quantity;
}
if(foodAvailable=="Egg biriyani"){
return 320*quantity;
}
else{
System.out.println(foodAvailable+" not found");
}
return 0.0;
}
}