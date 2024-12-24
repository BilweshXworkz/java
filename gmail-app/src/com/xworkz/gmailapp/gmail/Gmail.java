package com.xworkz.gmailapp.gmail;

import com.xworkz.gmailapp.Exception.*;
import com.xworkz.gmailapp.maildata.EMail;
import com.xworkz.gmailapp.operation.GmailOperation;

import java.util.Arrays;


public class Gmail {
    EMail eMail[] = null;
    int index;

    public Gmail(int size) {
        eMail = new EMail[size];
    }

    public void addMail(EMail eMail) {
        if (eMail.getGId() > 0 &&
                eMail.getFrom() != null &&
                eMail.getTo() != null &&
                eMail.getBody() != null) {
            this.eMail[index++] = eMail;
        }
    }

    public void getMail() {
        if (eMail != null) {
            for (EMail eMail1 : this.eMail) {
                if (eMail1 != null) {
                    System.out.println("GID : " + eMail1.getGId());
                    System.out.println("From : " + eMail1.getFrom());
                    System.out.println("To : " + eMail1.getTo());
                    System.out.println("Subject : " + eMail1.getSubject());
                    System.out.println("Body : " + eMail1.getBody());
                    System.out.println("Attached : " + eMail1.isAttached());
                }
            }
        }
    }

    public void getGmailIdDetails(GmailOperation gmailOperation){
        System.out.println("Gmail Id : " + gmailOperation.getGId());
        System.out.println("To : " + gmailOperation.getTo());
        System.out.println("From : " + gmailOperation.getFrom());
        System.out.println("Body : " + gmailOperation.getBody());
        System.out.println("Document Attachment : " + gmailOperation.isDocAttached());
        System.out.println("===========================================");

    }

    public void getGmailByTo(String to){
        try {
            boolean isToFound = false;
            for (EMail eMail1 : this.eMail) {
                if (eMail1.getTo().equals(to)) {
                    getMail();
                    isToFound = true;
                } else System.out.println("The Mail Not found");
            }
            if (isToFound == false){
                throw new GetGmailByToException();
            }
        }catch (GetGmailByToException e){
            e.printStackTrace();
        }
    }

    public void getGmailByFrom(String from){
        try {
            boolean isFromFound = false;
            for (EMail eMail1 : this.eMail) {
                if (eMail1.getFrom().equals(from)) {
                    getMail();
                    isFromFound = true;
                } else System.out.println("The Mail Not found");
            }
            if (isFromFound == false){
                throw new GetGmailByFromException();
            }
        }catch (GetGmailByFromException e){
            e.printStackTrace();
        }
    }

    public void getToById(int id){
        try {
            boolean isIdFound = false;
            for (EMail eMail1 : this.eMail) {
                if (eMail1.getGId() == id) {
                    eMail1.getTo();
                    isIdFound = true;
                } else System.out.println("GID is not found");
            }
            if (isIdFound == false){
                throw new GetToByIdException();
            }
        }catch (GetToByIdException e){
            e.printStackTrace();
        }
    }

    public void getFromById(int id){
        try {
            boolean isIdFound = false;
            for (EMail eMail1 : this.eMail) {
                if (eMail1.getGId() == id) {
                    eMail1.getFrom();
                    isIdFound = true;
                } else System.out.println("GID is not found");
            }
            if (isIdFound == false){
                throw new GetFromByIdException();
            }
        }catch (GetFromByIdException e){
            e.printStackTrace();
        }
    }

    public void getSubjectByTo(String to){
        try {
            boolean isToFound = false;
            for (EMail eMail1 : this.eMail) {
                if (eMail1.getTo().equals(to)) {
                    eMail1.getSubject();
                    isToFound = true;
                } else System.out.println("The Mail is not found");
            }
            if (isToFound == false){
                throw new GetSubjectByToException();
            }
        }
        catch (GetSubjectByToException e){
            e.printStackTrace();
        }
    }

    public void getBodyByTo(String to) {
        try {
            boolean isToFound = false;
            for (EMail eMail1 : this.eMail) {
                if (eMail1.getTo().equals(to)) {
                    eMail1.getBody();
                    isToFound = true;
                } else System.out.println("The mail not found");
            }
            if (isToFound == false){
                throw new GetBodyByToException();
            }
        } catch (GetBodyByToException e){
            e.printStackTrace();
        }
    }

    public void getDeleteByTo(String to){
        int index;
        int newIndex = 0;
        boolean isToDeleted = false;
        try {
            for (index = 0; index < this.eMail.length; index++) {
                EMail eMail1 = this.eMail[index];
                if (eMail1.getTo() != to) {
                    eMail[newIndex++] = this.eMail[index];
                } else {
                    System.out.println("The Mail Deleted");
                    isToDeleted = true;
                }
            }
            if(isToDeleted == false){
                throw new GetDeleteByToException("The To is not Deleted");
            }
        }catch (GetDeleteByToException e){
            e.printStackTrace();
        }
        int size = newIndex;
        eMail = Arrays.copyOf(this.eMail, size);
    }
}


