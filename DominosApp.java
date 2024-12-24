class DominosApp{

public static double search(String foodAvailable){
if(foodAvailable=="Veg loaded"){
return 185;
}
if(foodAvailable=="Golden corn"){
return 89;
}
if(foodAvailable=="Chicken sausage"){
return 109;
}
if(foodAvailable=="Classic pizza mania"){
return 49;
}
if(foodAvailable=="veg parcel"){
return 49;
}
if(foodAvailable=="Chicken parcel"){
return 59;
}
if(foodAvailable=="Burger pizza - classic veg"){
return 119;
}
if(foodAvailable=="Burger pizza - premium veg"){
return 149;
}
if(foodAvailable=="Burger pizza - classic non veg"){
return 159;
}
if(foodAvailable=="Harissa dip"){
return 49;
}
if(foodAvailable=="Non veg loaded"){
return 199;
}
if(foodAvailable=="Pepper barbecue pizza"){
return 199;
}
if(foodAvailable=="2 onion pizza mania"){
return 138;
}
if(foodAvailable=="2 classic pizza combo"){
return 98;
}
if(foodAvailable=="Classic & onion pizza"){
return 118;
}
else{
System.out.println(foodAvailable+" not found");
return 0.0;

}
}

public static double search(String foodAvailable, int quantity){
if(foodAvailable=="Veg loaded"){
return 185*quantity;
}
if(foodAvailable=="Golden corn"){
return 89*quantity;
}
if(foodAvailable=="Chicken sausage"){
return 109*quantity;
}
if(foodAvailable=="Classic pizza mania"){
return 49*quantity;
}
if(foodAvailable=="veg parcel"){
return 49*quantity;
}
if(foodAvailable=="Chicken parcel"){
return 59*quantity;
}
if(foodAvailable=="Burger pizza - classic veg"){
return 119*quantity;
}
if(foodAvailable=="Burger pizza - premium veg"){
return 149*quantity;
}
if(foodAvailable=="Burger pizza - classic non veg"){
return 159*quantity;
}
if(foodAvailable=="Harissa dip"){
return 49*quantity;
}
if(foodAvailable=="Non veg loaded"){
return 199*quantity;
}
if(foodAvailable=="Pepper barbecue pizza"){
return 199*quantity;
}
if(foodAvailable=="2 onion pizza mania"){
return 138*quantity;
}
if(foodAvailable=="2 classic pizza combo"){
return 98*quantity;
}
if(foodAvailable=="Classic & onion pizza"){
return 118*quantity;
}
else{
System.out.println(foodAvailable+" not found");
return 0.0;

}
}
}