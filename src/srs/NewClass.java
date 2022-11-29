/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srs;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class NewClass {
    Connection conn = null;
        public static Connection ConnectDB(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connsrting = "jdbc:sqlserver://localhost:1433;databaseName=tortik;user=sa;password=1;";
            Connection conn = DriverManager.getConnection(connsrting);
//            JOptionPane.showMessageDialog(null, "Connect");
            return conn;
        } 
        catch(Exception e){
            e.printStackTrace();
            return null;
        }}}
