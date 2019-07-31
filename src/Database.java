import java.sql.*;
import sun.applet.Main;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kundu
 */
public class Database {
    public static void main (String [] args){
        Connection myConn=null;
        Statement myStat=null;
        ResultSet myRes=null;
        
        String user="root";
        String password="";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/carparking_db",user,password);
            myStat=myConn.createStatement();
//            
            myRes=myStat.executeQuery("select * from user");
            
            while(myRes.next()){
                System.out.println(myRes.getString("name"));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
                
    }
}
