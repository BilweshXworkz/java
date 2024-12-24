package com.xworkz.gmailapp;

import com.xworkz.gmailapp.gmail.Gmail;
import com.xworkz.gmailapp.maildata.EMail;
import com.xworkz.gmailapp.operation.GmailOperation;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class GmailRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of mail");
        int size = scanner.nextInt();
        Gmail gmail = new Gmail(size);

        for(int i=0; i<size; i++) {
            EMail eMail = new EMail();
            System.out.println("Gmail ID : ");
            int id = scanner.nextInt();
            eMail.setGId(id);
            System.out.println("To : ");
            String to = scanner.next();
            eMail.setTo(to);
            System.out.println("From :");
            String from = scanner.next();
            eMail.setFrom(from);
            System.out.println("Subject : ");
            String sub = scanner.next();
            eMail.setSubject(sub);
            System.out.println("Body");
            scanner.nextLine();
            String body = scanner.nextLine();
            eMail.setBody(body);
            System.out.println("Attachment : ");
            boolean attach = scanner.nextBoolean();
            eMail.setAttached(attach);
            System.out.println("===============================");
            gmail.addMail(eMail);
        }
        String input = null;

        do {
            System.out.println("Press 1 to get All the Mail's.");
            System.out.println("Press 2 to get Gmail Id Details");
            System.out.println("Press 3 to get Gmail by To");
            System.out.println("Press 4 to get Gmail by From");
            System.out.println("Press 5 to get To by Id");
            System.out.println("Press 6 to get From by Id");
            System.out.println("Press 7 to get Subject by To");
            System.out.println("Press 8 to get Body by To");
            System.out.println("Press 9 to get Delete by To");
            int options = scanner.nextInt();

            switch (options){
                case 1:
                    gmail.getMail();
                    break;
                case 2:
                    System.out.println("Please Enter the Gmail Id Details");
//                    gmail.getGmailIdDetails(scanner.next());
                    break;
                case 3:
                    System.out.println("Please Enter To Mail Id");
                    gmail.getGmailByTo(scanner.next());
                    break;
                case 4:
                    System.out.println("Please Enter From Mail Id");
                    gmail.getGmailByFrom(scanner.next());
                    break;
                case 5:
                    System.out.println("Please Enter the Id");
                    gmail.getToById(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Please Enter the Id");
                    gmail.getFromById(scanner.nextInt());
                    break;
                case 7:
                    System.out.println("Please Enter To Mail");
                    gmail.getSubjectByTo(scanner.next());
                    break;
                case 8:
                    System.out.println("Please Enter the To");
                    gmail.getBodyByTo(scanner.next());
                    break;
                case 9:
                    System.out.println("Please Enter the To to be deleted");
                    gmail.getDeleteByTo(scanner.next());
                    break;
                default:
                    System.out.println("Please Enter the valid Number...");
            }

            System.out.println("Do you want to continue Yes/No");
            input = scanner.next();
        }while (input.equalsIgnoreCase("Yes"));
    }
}
