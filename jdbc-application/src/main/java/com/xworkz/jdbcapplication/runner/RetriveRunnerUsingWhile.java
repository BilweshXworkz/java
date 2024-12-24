package com.xworkz.jdbcapplication.runner;

import java.sql.*;

public class RetriveRunnerUsingWhile {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class loaded");
            String url = "jdbc:mysql://localhost:3306/university";
            String userName = "root";
            String password = "bilwesh";
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("DataBase connected");
            statement = connection.createStatement(); // nullPointerException
            String query = "select * from universitys";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println("UnID : "+ resultSet.getInt(1)+ ", university_Name : "+resultSet.getString(2)+ ", Location : "+resultSet.getString(3));
            }

       }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("The JDBC is not connected"+e.getMessage());
        }
        finally {
            try {
                connection.close();
            }
            catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Main Ended");
    }
}
