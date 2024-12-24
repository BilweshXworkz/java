package com.xworkz.universityapp;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class UniversityRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("The Database loaded");
            String url = "jdbc:mysql://localhost:3306/University2";
            String userName = "root";
            String password = "bilwesh";
            DriverManager.getConnection(url, userName, password);
            System.out.println("The DataBase connected");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("The DataBase not connected"+e.getMessage());
        }
        System.out.println("Main Ended");
    }
}
