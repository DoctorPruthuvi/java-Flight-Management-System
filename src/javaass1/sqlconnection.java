/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaass1;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author prutu
 */
public class sqlconnection {
    
    public static Connection getConnection(){
    
    Connection con = null;
      try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsass?zeroDateTimeBehavior=convertToNull","root","");
           
           JOptionPane.showMessageDialog(null," Connected");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Not Connected");
        }
        return con;
    
}}
