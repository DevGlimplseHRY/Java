package com.jdbc;
import java.sql.*;

public class FirstConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://mysql://localhost:3306/dbname", "root", "password");
        }catch (Exception e){
            System.out.println(e);
            String q = "CREATE table tb_table1(tId INT(20) PRIMARY_KEY AUTO_INCREMENT, tName VARCHAR(20) NOT NULL, tCity VARCHAR(400))";
        }
    }
}
