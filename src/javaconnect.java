/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sahan Dinuka
 */
import java.sql.*;
import javax.swing.*;

public class javaconnect {
Connection conn = null;

      public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/loginls","root","");
            System.out.println("Database Connected!");
            return conn;
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,"Unable to connect Database","Oopz",JOptionPane.ERROR_MESSAGE);
    return null;
}
        
    
}
}