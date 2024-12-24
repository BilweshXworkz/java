class Zepto{


public static double search(String foodAvailable){
if(foodAvailable=="Daily seasonings mix"){
return 229;
}
if(foodAvailable=="Sweet corn"){
return 55;
}
if(foodAvailable=="Sweet potato"){
return 99;
}
if(foodAvailable=="Lady's finger"){
return 18;
}
if(foodAvailable=="Indian tomato"){
return 25;
}
if(foodAvailable=="Onion"){
return 72;
}
if(foodAvailable=="Cauliflower"){
return 35;
}
if(foodAvailable=="Potato"){
return 55;
}
if(foodAvailable=="Haricot bean"){
return 26;
}
if(foodAvailable=="Baby cabbage"){
return 49;
}
if(foodAvailable=="Lemon"){
return 59;
}
if(foodAvailable=="Drumstick"){
return 19;
}
if(foodAvailable=="Bottle gourd"){
return 41;
}
if(foodAvailable=="Bitter gourd"){
return 39;
}
if(foodAvailable=="Coriander"){
return 41;
}
else{
System.out.println(foodAvailable+" not found");
return 0.0;
}

}

public static double search(String foodAvailable, int quantity){
if(foodAvailable=="Daily seasonings mix"){
return 229*quantity;
}
if(foodAvailable=="Sweet corn"){
return 55*quantity;
}
if(foodAvailable=="Sweet potato"){
return 99*quantity;
}
if(foodAvailable=="Lady's finger"){
return 18*quantity;
}
if(foodAvailable=="Indian tomato"){
return 25*quantity;
}
if(foodAvailable=="Onion"){
return 72*quantity;
}
if(foodAvailable=="Cauliflower"){
return 35*quantity;
}
if(foodAvailable=="Potato"){
return 55*quantity;
}
if(foodAvailable=="Haricot bean"){
return 26*quantity;
}
if(foodAvailable=="Baby cabbage"){
return 49*quantity;
}
if(foodAvailable=="Lemon"){
return 59*quantity;
}
if(foodAvailable=="Drumstick"){
return 19*quantity;
}
if(foodAvailable=="Bottle gourd"){
return 41*quantity;
}
if(foodAvailable=="Bitter gourd"){
return 39*quantity;
}
if(foodAvailable=="Coriander"){
return 41*quantity;
}
else{
System.out.println(foodAvailable+" not found");
return 0.0;
}

}
}