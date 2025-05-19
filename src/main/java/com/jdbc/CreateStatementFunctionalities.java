package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateStatementFunctionalities {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionProviderJDBC.getConnection();

            String query = "SELECT * FROM tb_table1";
//            String query = "DELETE FROM tb_table1 WHERE tName = 'Vikram'";
//            String name = "Vikram3";
//            String city = "Hisar3";

//            String query = "INSERT INTO tb_table1(tName, tCity) VALUES('Vikram2', 'Hisar2')";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
//            statement.executeQuery(query);
//            statement.executeUpdate(query);
//            System.out.println("Data inserted.");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3));
////                System.out.println(STR."\{resultset.getString(1)} | \{resultset.getString(2)} | \{resultset.getString(3)}");
            }
        }catch (Exception e){
            System.out.println("Some exception occurred in main class");
            e.printStackTrace();

            //Get, update and delete, all operations can be performed using createStatement.
        }
    }
}
