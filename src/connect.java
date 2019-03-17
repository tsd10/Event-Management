/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tushar
 */
import java.sql.*;  
import javax.swing.*;   
public class connect{  
   Connection conn;
    
   public static Connection ConnectDb(){
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/event_mngmnt","root","root");  
        return con;
       }catch(Exception e)
          { JOptionPane.showMessageDialog(null,e);}  
      return null;
        }  
    }  