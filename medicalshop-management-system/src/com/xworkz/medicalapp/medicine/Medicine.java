package com.xworkz.medicalapp.medicine;

public class Medicine {
    private int medicineId;
    private String medicineName;
    private double medicineWeight;
    private double medicinePrice;

    public Medicine(){

    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineWeight(double medicineWeight) {
        this.medicineWeight = medicineWeight;
    }

    public double getMedicineWeight() {
        return medicineWeight;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }
}
