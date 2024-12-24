package com.xworkz.gmailapp.operation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GmailOperation {
    private int gId;
    private String to;
    private String from;
    private String subject;
    private String body;
    private boolean isDocAttached;

    @Override
    public int hashCode(){
        return gId;
    }

    @Override
    public String toString(){
        return "Gmail ID : "+gId+"," +
                "To : "+to+"," +
                "From : "+from+"," +
                "Subject : "+subject+"," +
                "Body : "+body+"," +
                "Attached "+isDocAttached+".";
    }

    @Override
    public boolean equals(Object obj){
        GmailOperation gmailOperation = (GmailOperation) obj;
        if(this.gId == gmailOperation.gId &&
                this.body == gmailOperation.body &&
                this.to == gmailOperation.to &&
                this.from == gmailOperation.from)
            return true;
        return false;
    }
}
