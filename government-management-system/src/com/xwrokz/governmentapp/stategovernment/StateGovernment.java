package com.xwrokz.governmentapp.stategovernment;

import com.xwrokz.governmentapp.government.Government;

public class StateGovernment extends Government {
    String govDetails;

    public StateGovernment(String state, int noOfMlas, String partyHeadName, String homeMinsterName){
        super(state, noOfMlas, partyHeadName, homeMinsterName);
        this.govDetails = govDetails;
    }

    @Override
    public void governmentDetails(){
        if()
        super.governmentDetails();
        System.out.println("GovDetails : "+govDetails);
    }
}
