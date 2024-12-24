package com.xworkz.medicalapp.shop;

import com.xworkz.medicalapp.medicine.Medicine;

public class MedicalShop {
    Medicine medicine;

    public  boolean addMedicine(Medicine medicine){
        boolean isAdded = false;
        if(medicine != null){
            if(medicine.getMedicineId() > 0 && medicine.getMedicineName() != null){
                this.medicine = medicine;
                isAdded = true;
            }
            else{
                System.out.println("Please enter the medicine details");
            }
        }
        return isAdded;
    }

    public void fetchMedicine(){
        System.out.println("Medicine Name : "+medicine.getMedicineName());
        System.out.println("Medicine ID : "+medicine.getMedicineId());
        System.out.println("Medicine Weight : "+medicine.getMedicineWeight());
        System.out.println("Medicine Price : Rs."+medicine.getMedicinePrice());
    }
}
