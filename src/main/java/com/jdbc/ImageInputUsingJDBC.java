package com.jdbc;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ImageInputUsingJDBC {
    public static void main(String[] args) {
        try{
            Connection connection = ConnectionProviderJDBC.getConnection();
            String query = "INSERT INTO tb_images(image) VALUES(?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // open dialog box to select file
            JFileChooser jFileChooser = new JFileChooser();
            // specify the position and mandatory
            jFileChooser.showOpenDialog(null);
            File file = jFileChooser.getSelectedFile();
            // manually specify the path
//            File file = new File("\\C:\\Users\\Ishab\\Downloads\\AU.jpg");
            FileInputStream fileInputStream = new FileInputStream(file);
            preparedStatement.setBinaryStream(1, fileInputStream, fileInputStream.available());
            preparedStatement.executeUpdate();

            System.out.println("image inserted");

        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}