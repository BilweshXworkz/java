package com.xwrokz.governmentapp;

import com.xwrokz.governmentapp.CentrlGovernmnet.CentrlGovernmnet;
import com.xwrokz.governmentapp.government.Government;
import com.xwrokz.governmentapp.stategovernment.StateGovernment;

public class GovernmentRunner {
    public static void main(String[] args) {
        CentrlGovernmnet centrlGovernmnet = new CentrlGovernmnet("India", "John Doe", "Narendra Modi","Rajnath Singh");
        StateGovernment stateGovernment = new StateGovernment("Karnataka", 224, "Jane Doe", "Araga Jnanendra");

        centrlGovernmnet.governmentDetails();
        stateGovernment.governmentDetails();
    }
}
