package com.xworkz.universityapp;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManagementRunner {
    public static void main(String[] args) {
        System.out.println("The Main Started");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("The Database is loading");
            String url = "jdbc:mysql://localhost:3306/MangementRunner";
            String userName = "root";
            String password = "bilwesh";
            DriverManager.getConnection(url, userName, password);
            System.out.println("The Database is connected");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("The Database is not connected "+e.getMessage());
        }
        System.out.println("The Main Ended");
    }
}
