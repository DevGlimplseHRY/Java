package com.jdbc;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStatementJDBC {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            Connection connection = ConnectionProviderJDBC.getConnection();

//            String query = "INSERT INTO tb_table1(tName, tCity) VALUES(?, ?)";
//            String query = "SELECT * FROM tb_table1";
//            String query = "UPDATE tb_table1 SET tName = 'Dheeraj Yadav' WHERE tId = 6";

                String query = "UPDATE tb_table1 SET tName = ? WHERE tId = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
//            Statement statement = connection.createStatement();
                System.out.print("Please enter tName: ");
                System.out.println();
//                String tName = scanner.nextLine();
                String tName = bufferedReader.readLine();
//                bufferedReader.readLine();
                System.out.print("Please enter tId: ");
                System.out.println();
                int tId = scanner.nextInt();
//                int tId = bufferedReader.read();
//            System.out.println("tId is: " + tId);
                preparedStatement.setString(1, tName);
                preparedStatement.setInt(2, tId);
                preparedStatement.executeUpdate();

//            statement.executeUpdate(query);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()){
//                System.out.println(resultSet.getString(1) + " | " + resultSet.getString(2) + " | " + resultSet.getString(3));
////                System.out.println(STR."\{resultSet.getString(1)} | Hi  \{resultSet.getString(2)} hello \{resultSet.getString(3)} ji" );
//            }
//            System.out.println("Data inserted using prepare statement");
            System.out.println("Data updated using prepare statement");

            scanner.close();
            connection.close();
        }catch (Exception e){
            System.out.println("Some exception occurred in Prepared statement main class");
            e.printStackTrace();
        }
    }
}
