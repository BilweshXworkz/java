package com.xworkz.instituteapp.trainee;

import com.xworkz.instituteapp.constants.GenderType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Trainee extends Object {
    private int traineeId;
    private String traineeName;
    private String traineeDob;
    private GenderType gender;
    private String traineeEmailId;
    private long phoneNo;
    private String degreeName;
    private int yearOfGraduation;
    private boolean isPlaced;

    @Override
    public String toString(){
        return "Trainee Id - "+traineeId+", Trainee Name - "+traineeName+", Trainee DOB - "+traineeDob+".";
    }
}
