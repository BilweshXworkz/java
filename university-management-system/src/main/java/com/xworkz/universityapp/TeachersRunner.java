package com.xworkz.universityapp;

import java.sql.*;

public class TeachersRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("The Database is loading...");
            String url = "jdbc:mysql://localhost:3306/TeachersRunner";
            String userName = "root";
            String password = "bilwesh";
            DriverManager.getConnection(url, userName, password);
            System.out.println("The Database connected ");
        }catch (ClassNotFoundException|SQLException e){
            System.out.println("The Database not connected "+e.getMessage());
        }
        System.out.println("Main Ended");
    }
}
