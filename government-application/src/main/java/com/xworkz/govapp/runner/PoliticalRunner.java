package com.xworkz.govapp.runner;

import com.sun.javaws.exceptions.CacheAccessException;

import java.sql.DriverManager;
import java.sql.SQLException;

public class PoliticalRunner {
    public static void main(String[] args) {
        System.out.println("The main Started");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("database loading....");
            String url = "jdbc:mysql://localhost:3306/PoliticalRunner";
            String userName = "root";
            String password = "bilwesh";
            System.out.println("database connected");
            DriverManager.getConnection(url, userName,password);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("database not connected"+e.getMessage());
        }
        System.out.println("The main Ended");
    }
}
