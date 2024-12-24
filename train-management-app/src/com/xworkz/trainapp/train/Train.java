package com.xworkz.trainapp.train;

public class Train {
    int trainNo;
    String route;
    String source;
    String destination;

    public  Train(int trainNo, String source, String destination){
        this.trainNo = trainNo;
        this.source = source;
        this.destination = destination;
    }

    public  Train(String route, String source, String destination){
        this.route = route;
        this.source = source;
        this.destination = destination;
    }

    public void trainDetails(){
        System.out.println("The Train Number : "+trainNo);
        System.out.println("The Train Source : "+source);
        System.out.println("The Train destination : "+destination);
    }

}
