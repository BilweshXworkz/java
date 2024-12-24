package com.xworkz.govapp.runner;

import java.sql.DriverManager;
import java.sql.SQLException;

public class GovWorks {
    public static void main(String[] args) {
        System.out.println("The main started");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Database loading...");
            DriverManager.getConnection("jdbc:mysql://localhost:3306/GovWorks", "root", "bilwesh");
            System.out.println("Database connected...");
        }catch (ClassNotFoundException| SQLException e){
            System.out.println("Database not connected..."+e.getMessage());
        }
        System.out.println("The main ended");
    }
}
