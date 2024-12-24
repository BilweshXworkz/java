package com.xworkz.trainapp.metro;

import com.xworkz.trainapp.train.Train;

public class MetroTrain extends Train {
    String metroTrain;

    public MetroTrain(String  route, String source, String destination){
        super(route, source, destination);
//        this.metroTrain = metroTrain;
    }

    @Override
    public void trainDetails(){
        super.trainDetails();
        System.out.println("The Metro Detail : ");
    }
}
