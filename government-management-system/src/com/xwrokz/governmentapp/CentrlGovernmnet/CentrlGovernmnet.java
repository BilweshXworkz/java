package com.xwrokz.governmentapp.CentrlGovernmnet;

import com.xwrokz.governmentapp.government.Government;

public class CentrlGovernmnet extends Government {
    String CentrlDetails;

    public CentrlGovernmnet(String state, String partyHeadName, String homeMinsterName, String CentrlDetails){
        super(state, partyHeadName, homeMinsterName);
        this.CentrlDetails = CentrlDetails;
    }

    @Override
    public void governmentDetails(){
        super.governmentDetails();
        System.out.println("GovDetails : "+CentrlDetails);
    }
}
