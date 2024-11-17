/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connectors;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Allend
 */
public class Connctosql {
    private static String url ="jdbc:mysql://localhost:3306/customerinfo";
    private static String user ="root";
    private static String pass ="";
    
    private static Connection connect;
    private static Connctosql ctd;
    
     public Connctosql(){
         connect = null;
         try {
             connect = DriverManager.getConnection(url, user, pass);
             JOptionPane.showMessageDialog(null, "Connected Succesfull", "", 0);
         
         }catch (Exception e){
             JOptionPane.showConfirmDialog(null, "Connection error", url, 0);
         }
    }
     public static Connctosql getDBConnection() {
        if (ctd== null){
        ctd=new Connctosql();
        }
                
        return ctd;
    }
     public static Connection getConnection(){
         
        
        return connect;
         
        
    }
    
}
