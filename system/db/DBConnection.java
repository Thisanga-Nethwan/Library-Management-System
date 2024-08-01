/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class DBConnection {
    
    public static Connection connect(){
        Connection connection= null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","T1D2max9");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return connection;
    }
}
   /* private static DBConnection dbconnection;
    private Connection connection;
    private DBConnection() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
         connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","T1D2max9");
        
    }
    public static DBConnection getInstance()throws ClassNotFoundException,SQLException{
        if(dbconnection==null){
            dbconnection=new DBConnection();
            
        }
         return dbconnection;
    }
    public Connection getConnection(){
        return connection;
    }}*/



