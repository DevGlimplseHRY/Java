package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProviderJDBC {
    private static Connection connection;
    public static Connection getConnection(){
       try{
           // load the driver
           Class.forName("com.mysql.cj.jdbc.Driver");
           String url = "jdbc:mysql://localhost:3306/youtube";
           // create the connection
           connection = DriverManager.getConnection(url, "root", "password");
       }catch(Exception e){
           System.out.println("Some exception occurred in Connection Provider class");
           e.printStackTrace();
       }
       return connection;
    }
}
