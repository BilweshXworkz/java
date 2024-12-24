package com.xworkz.trainapp.suburbantrain;

import com.xworkz.trainapp.train.Train;

public class SubUrbanTrain extends Train {
    String SubUrbanTrain;
    public SubUrbanTrain(int trainNo, String source, String destination){
        super(trainNo, source, destination);
    }

    @Override
    public void trainDetails(){
        super.trainDetails();
        System.out.println("The Sub Urban Train ");
    }
}
