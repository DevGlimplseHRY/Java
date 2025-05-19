package com.jdbc;

import java.sql.*;

public class DebugJDBC {
    public static void main(String[] args) {
        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            Connection con = DriverManager.getConnection(url,"root", "password");

            // String query = "SELECT * FROM tb_images";
            String query = "SHOW TABLES";
            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(query);
//            System.out.println(set);
            while (set.next()){
                System.out.println(set.getString(1));
            }
            con.close();
            System.out.println("Connection established.");
        }catch (Exception e){
            System.out.println("Some exception occurred.");
        }
    }
}
