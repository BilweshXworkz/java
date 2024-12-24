package com.xwrokz.governmentapp.government;

public class Government {
    String state;
    int noOfMlas;
    String partyHeadName;
    String homeMinsterName;

    public Government(String state, int noOfMlas, String partyHeadName, String homeMinsterName){
        this.state = state;
        this.noOfMlas = noOfMlas;
        this.partyHeadName = partyHeadName;
        this.homeMinsterName = homeMinsterName;
    }

    public Government(String state, String partyHeadName, String homeMinsterName){
        this.state = state;
        this.partyHeadName = partyHeadName;
        this.homeMinsterName = homeMinsterName;
    }

    public void governmentDetails(){
        System.out.println("The state : "+state);
        System.out.println("The Number of MLA : "+noOfMlas);
        System.out.println("The Party Head : "+partyHeadName);
        System.out.println("The Home Minster : "+homeMinsterName);
    }
}
