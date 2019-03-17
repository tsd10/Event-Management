/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author tushar
 */
import java.sql.*;
import javax.swing.*;
import java.awt.*;
public class Organisier extends javax.swing.JFrame{
Connection conn;
ResultSet rs;
PreparedStatement pat;

    public Organisier()
    {
       // initComponents();
        search_db();
        conn=connect.ConnectDb();
    }

    
    public void search_db()
    {
        String sql="Select name_of_event from event_creation";
        
        try {
            
          pat=conn.prepareStatement(sql);
          rs=pat.executeQuery();
          
          while(rs.next())
          {
              initComponents();
          }
            
        }catch(Exception e)
        {
            
        }
        
    }
    
    public  javax.swing.JButton add_button()
    {
        jButton1 = new javax.swing.JButton();
        return jButton1;
    }
    
    private void initComponents()
    {
        int i=1;
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(i, 0));
        getContentPane().add(add_button());
        i++;
    }
    
        private javax.swing.JButton jButton1;
    
        public static void main(String args[])
        {
            Organisier o=new Organisier();
              o.setVisible(true);
        }
    
}
