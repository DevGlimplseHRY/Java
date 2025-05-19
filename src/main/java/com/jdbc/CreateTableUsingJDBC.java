package com.jdbc;
import java.sql.*;
public class CreateTableUsingJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "password";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            System.out.println("Connection created ...");
//            stmt.execute();

        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Class not found exception occurred");
            e.printStackTrace();
        }
    }
}
