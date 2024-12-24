package com.xworkz.jdbcapplication.runner;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Stack;

public class UniversityRunner {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// load/register
            System.out.println("class loaded");
            String url = "jdbc:mysql://localhost:3306/university";
            String userName = "root";
            String password = "bilwesh";
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("DataBase connected");
//            String insert = "insert into universitys (university_Name, university_location)values('VTU', 'Yelahanka')";
            String insert1 = "insert into universitys (university_Name, university_location) values('Indian Institute of Science', 'Bangalore')";
            String insert2 = "insert into universitys (university_Name, university_location) values('Banaras Hindu University', 'Varanasi')";
            String insert3 = "insert into universitys (university_Name, university_location) values('University of Delhi', 'New Delhi')";
            Statement statement = connection.createStatement();
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
//          int row = statement.execute eUpdate(insert);
          int[] row = statement.executeBatch();
            System.out.println(+row.length+ " Row is inserted");
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("The JDBC is not connected"+e.getMessage());
        }
        finally {
            try {
                connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
