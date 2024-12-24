package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicine.Medicine;
import com.xworkz.medicalapp.shop.MedicalShop;

public class ShopRunner {
    public static void main(String[] args) {
        Medicine medicine = new Medicine();
        MedicalShop medicalShop = new MedicalShop();

        medicine.setMedicineId(1254);
        medicine.setMedicineName("Met XL Trio 250");
        medicine.setMedicineWeight(25.1);
        medicine.setMedicinePrice(221.00);

        medicalShop.addMedicine(medicine);
        medicalShop.fetchMedicine();
    }
}
