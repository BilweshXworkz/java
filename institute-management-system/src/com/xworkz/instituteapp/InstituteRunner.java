package com.xworkz.instituteapp;

import com.xworkz.instituteapp.constants.GenderType;
import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Scanner;

public class InstituteRunner {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Institute");
        int size = scanner.nextInt();
        Institute institute = new Institute(size);

        for(int i = 0; i<size; i++) {
            Trainee trainee = new Trainee();
            System.out.println("Trainee Id : ");
            int iD = scanner.nextInt();
            trainee.setTraineeId(iD);
            System.out.println("Trainee Name : ");
            String name = scanner.next();
            trainee.setTraineeName(name);
            System.out.println("Date Of Birth : ");
            String dob = scanner.next();
            trainee.setTraineeDob(dob);
            System.out.println("Phone Number : ");
            long phoneNum = scanner.nextLong();
            trainee.setPhoneNo(phoneNum);
            System.out.println("Gmail Id : ");
            String mail = scanner.next();
            trainee.setTraineeEmailId(mail);
            System.out.println("Gender : ");
            trainee.setGender(GenderType.valueOf(scanner.next().toUpperCase()));
            System.out.println("Courses : ");
            String course = scanner.next();
            trainee.setDegreeName(course);
            System.out.println("Year Of joining : ");
            int year = scanner.nextInt();
            trainee.setYearOfGraduation(year);
            System.out.println("Placed Or Not");
            boolean placed = scanner.nextBoolean();
            trainee.setPlaced(placed);
            institute.addTrainee(trainee);
        }

        institute.getTrainee();
        String value = null;
        do {
            System.out.println("Press 1 to Get Name By Id");
            System.out.println("Press 2 to Get Gender By name");
            System.out.println("Press 3 to Get Name By Gender");
            System.out.println("Press 4 to Get PhoneNo By Name");
            System.out.println("Press 5 to Get Email By Name");
            System.out.println("Press 6 to Get Email By Id");
            System.out.println("Press 7 to Get Dob By Id");
            System.out.println("Press 8 to Get Degree By Name");
            System.out.println("Press 9 to Get Year Of Graduation By DegreeName");
            System.out.println("Press 10 to Update Email By Id");
            System.out.println("Press 11 to Update Phone Number By Name");
            System.out.println("Press 12 to Delete the Details");
            int options = scanner.nextInt();
            switch (options){
                case 1:
                    System.out.println("Please Enter ID :");
                    int id = scanner.nextInt();
                    String returnGetNameById = institute.getNameById(id);
                    System.out.println("The name of the ID : "+returnGetNameById);
                    break;
                case 2:
                    System.out.println("Please Enter Name :");
                    String name = scanner.next();
                    GenderType returnGenderByName = institute.getGenderByName(name);
                    System.out.println("The Trainee Gender : "+returnGenderByName);
                    break;
                case 3:
                    System.out.println("Please Enter Gender ");
                    GenderType  gender = GenderType.valueOf(scanner.next().toUpperCase());
                    String returnNameByGender = institute.getNameByGender(gender);
                    System.out.println("The Train name by is gender : "+returnNameByGender);
                    break;
                case 4:
                    System.out.println("Please Enter PhoneNo");
                    String name1 = scanner.next();
                    long returnPhoneNumberByName = institute.getPhoneNumberByName(name1);
                    System.out.println("The Phone Number : "+returnPhoneNumberByName);
                    break;
                case 5:
                    System.out.println("Please Enter Name");
                    String name2 = scanner.next();
                    String returnEmailByName = institute.getEmailByName(name2);
                    System.out .println("The Mail Id : "+returnEmailByName);
                    break;
                case 6:
                    System.out.println("Please Enter ID ");
                    int id1 = scanner.nextInt();
                    String returnEmailById = institute.getEmailById(id1);
                    System.out.println("The Mail Id : "+returnEmailById );
                    break;
                case 7:
                    System.out.println("Please Enter ID ");
                    int id2 = scanner.nextInt();
                    String returnDobById = institute.getDobById(id2);
                    System.out.println("The Date Of Birth : "+returnDobById);
                    break;
                case 8:
                    System.out.println("Please Enter Name");
                    String name3 = scanner.next();
                    String returnDegreeByID = institute.getDegreeNameByName(name3);
                    System.out.println("The Degree is : "+returnDegreeByID);
                    break;
                case 9:
                    System.out.println("Please Enter Degree");
                    String degree = scanner.next();
                    int returnYearOfGraduationByDegreeName = institute.getYearOfGraduationByDegreeName(degree);
                    System.out.println("The Year of Passing : "+returnYearOfGraduationByDegreeName);
                    break;
                case 10:
                    System.out.println("Please Enter Id and updated mail");
                    String mail = scanner.next();
                    int id3 = scanner.nextInt();
                    boolean returnUpdateEmail = institute.updateEmailById(mail, id3);
                    System.out.println("The Updated Email : "+returnUpdateEmail);
                    institute.getTrainee();
                    break;
                case 11:
                    System.out.println("Please Enter name and Updated PhoneNo");
                    String name4 = scanner.next();
                    long phNo1 = scanner.nextInt();
                    boolean returnUpdatedPhoneNumberByName = institute.updatePhoneNumberByName(phNo1,name4);
                    System.out.println("The Phone Number Updated : "+returnUpdatedPhoneNumberByName );
                    institute.getTrainee();
                    break;
                case 12:
                    System.out.println("Please Enter to be Deleted ");
                    int id4 = scanner.nextInt();
                    boolean returndeleteTraineeById = institute.deleteTraineeById(id4);
                    System.out.println("The Trainee Deleted " +returndeleteTraineeById);
                    institute.getTrainee();
                    break;
                default:
                    System.out.println("Please Enter the optional Number...");
            }
            System.out.println("Do you want to continue? (Type Yes or No)");
            value = scanner.next();
        }while(value.equalsIgnoreCase("Yes"));
        System.out.println("Thank You for Your Co-operation... ");
    }
}
