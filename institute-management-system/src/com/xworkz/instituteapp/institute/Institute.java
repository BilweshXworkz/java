package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.Exception.*;
import com.xworkz.instituteapp.constants.GenderType;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Arrays;

public class Institute {
    Trainee trainee[] = null;
    int index;

    public Institute(int size){
        trainee = new Trainee[size];
    }

    public boolean addTrainee(Trainee trainee){
        boolean isTraineeAdd = false;
        if(trainee.getTraineeId() > 0 &&
            trainee.getTraineeName() != null &&
             trainee.getPhoneNo() >0 &&
              trainee.getTraineeEmailId() != null){
            this.trainee[index++] =trainee;
            isTraineeAdd = true;
        }
        else {
            System.out.println("Trainee is not add");
        }
        return  isTraineeAdd;
    }

    public void getTrainee(){
        try {
            boolean isTraineeFound = false;
            if (trainee != null) {
                for (Trainee t : trainee) {
                    if (t != null) {
                        System.out.println("Trainee ID : " + t.getTraineeId());
                        System.out.println("Trainee Name : " + t.getTraineeName());
                        System.out.println("Trainee DOB : " + t.getTraineeDob());
                        System.out.println("Trainee EmailId : " + t.getTraineeEmailId());
                        System.out.println("Trainee Phone Number : " + t.getPhoneNo());
                        System.out.println("Trainee Gender : " + t.getGender());
                        System.out.println("Trainee Year of Graduation : " + t.getYearOfGraduation());
                        System.out.println("Trainee Degree Name : " + t.getDegreeName());
                        System.out.println("Is Trainee placed : " + t.isPlaced());
                        System.out.println("================================================");
                        isTraineeFound = true;
                    }
                }
            } if (isTraineeFound == false){
                throw new GetTraineeException("There is no Trainee Details.");
            }
        }catch (GetTraineeException e){
            e.printStackTrace();
        }
    }

    public String getNameById(int traineeId){
        String returnTraineeName = null;
        try {
            for (Trainee trainee1 : trainee) {
                if (trainee1.getTraineeId() == traineeId) {
                    returnTraineeName = trainee1.getTraineeName();
                }
            }
            if (returnTraineeName == null) {
                throw new GetNameByIdException(traineeId + " not found");
            }
        }catch (GetNameByIdException e){
            e.printStackTrace();
        }
        return returnTraineeName;
    }


    public GenderType getGenderByName(String traineeName){
        GenderType returnTraineeGender = null;
        try {
            for (Trainee trainee1 : trainee) {
                if (trainee1.getTraineeName() == traineeName) {
                    returnTraineeGender = trainee1.getGender();
                }
            }
            if (returnTraineeGender == null) {
                throw new GetNameByIdException("The Trainee name not found");
            }
        }catch (GetNameByIdException e){
            e.printStackTrace();
        }
        return returnTraineeGender;
    }

    public String  getNameByGender(GenderType genderType){
        String returnName = null;
        try {
            for (Trainee trainee1 : trainee) {
                if (trainee1.getGender() == genderType) {
                    returnName = trainee1.getTraineeName();
                }
            }
            if (returnName == null) {
                throw new GetNameByGenderException("Trainee not found");
            }
        }catch (GetNameByGenderException e){
            e.printStackTrace();
        }
        return returnName;
    }

    public long getPhoneNumberByName(String traineeName){
        long returnPhoneNo = 0;
        try {
            for (Trainee trainee1 : trainee) {
                if (trainee1.getTraineeName() == traineeName) {
                    returnPhoneNo = trainee1.getPhoneNo();
                }
            }
            if (returnPhoneNo == 0) {
                throw new GetPhoneNumberByNameException("The Trainee number not found");
            }
        }catch (GetPhoneNumberByNameException e){
            e.printStackTrace();
        }
        return returnPhoneNo;
    }

    public String getEmailByName(String traineeName){
        String returnEmail = null;
        try {
            for (Trainee trainee1 : trainee) {
                if (trainee1.getTraineeName() == traineeName) {
                    returnEmail = trainee1.getTraineeEmailId();
                }
            }
            if (returnEmail == null) {
                throw  new GetEmailByNameException("The Email not found");
            }
        }catch (GetEmailByNameException e){
            e.printStackTrace();
        }
        return returnEmail;
    }

    public String getEmailById(int traineeId){
        String returnEmail = null;
        try {
            for (Trainee trainee1 : trainee) {
                if (trainee1.getTraineeId() == traineeId) {
                    returnEmail = trainee1.getTraineeEmailId();
                }
            }
            if (returnEmail == null) {
                throw new GetEmailByIdException("The Email not found");
            }
        }catch (GetEmailByIdException e){
            e.printStackTrace();
        }
        return returnEmail;
    }

    public String getDobById(int traineeId){
        String returnDob = null;
        try {
            for (Trainee trainee1 : trainee) {
                if (trainee1.getTraineeId() == traineeId) {
                    returnDob = trainee1.getTraineeDob();
                }
            }
            if (returnDob == null) {
                throw new GetDobByIdException("The Date Of Birth ");
            }
        }catch (GetDobByIdException e){
            e.printStackTrace();
        }
        return returnDob;
    }


    public int getYearOfGraduationByDegreeName(String degreeName){
        int returnYearOfGraduationByDegreeName = 0;
        try {
            for (Trainee trainee1 : trainee) {
                if (trainee1.getDegreeName() == degreeName) {
                    returnYearOfGraduationByDegreeName = trainee1.getYearOfGraduation();
                }
            }
            if (returnYearOfGraduationByDegreeName == 0) {
                throw new GetYearOfGraduationByDegreeNameException("The Year not Found");
            }
        }catch (GetYearOfGraduationByDegreeNameException e){
            e.printStackTrace();
        }
        return returnYearOfGraduationByDegreeName;
    }


    public boolean updatePhoneNumberByName(long PhoneNo, String traineeName){
        boolean isPhoneNoUpdated = false;
        try {
            for (Trainee trainee1 : trainee) {
                if (trainee1.getTraineeName() == traineeName) {
                    trainee1.setPhoneNo(PhoneNo);
                    isPhoneNoUpdated = true;
                }
            }
            if (isPhoneNoUpdated == false) {
                throw new UpdatePhoneNumberByNameException("The Number not found");
            }
        }catch (UpdatePhoneNumberByNameException e){
            e.printStackTrace();
        }
        return isPhoneNoUpdated;
    }


    public boolean deleteTraineeById(int traineeId){
        boolean isTraineeDetailsDeletes = false;
        int index;
        int newIndex = 0;
        try {
            for (index = 0; index < trainee.length; index++) {
                Trainee trainee1 = this.trainee[index];
                if (trainee1.getTraineeId() != traineeId) {
                    this.trainee[newIndex++] = this.trainee[index];
                } else {
                    isTraineeDetailsDeletes = true;
                }
            }
            if (isTraineeDetailsDeletes == false){
                throw new DeleteTraineeByIdException("The Id is not found");
            }
        }catch (DeleteTraineeByIdException e){
            e.printStackTrace();
        }
        int size = newIndex;
        trainee = Arrays.copyOf(this.trainee, size);
        return isTraineeDetailsDeletes;
    }
}
