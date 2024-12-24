package com.xworkz.gmailapp.Mail;

import com.xworkz.gmailapp.maildata.EMail;
import com.xworkz.gmailapp.operation.GmailOperation;

public interface MailDetails{
    public void addMail(EMail email);
    public void getMail();
    public void getGmailIdDetails(GmailOperation gmailOperation);
    public void getGmailByTo(String to);
    public void getGmailByFrom(String from);
    public void getToById(int id);
    public void getFromById(int id);
    public void getSubjectByTo(String to);
    public void getBodyByTo(String to);
    public void deleteByTo(String to);
}
