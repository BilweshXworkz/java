package com.xworkz.trainapp;

import com.xworkz.trainapp.metro.MetroTrain;
import com.xworkz.trainapp.train.Train;

public class TrainRunner {
    public static void main(String[] args) {
        MetroTrain metroTrain = new MetroTrain("Baiyappanahalli to Kengeri", "Bangalore", "Mysore");
        metroTrain.trainDetails();
    }
}
