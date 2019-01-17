package Client;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awet
 */
public class Connector {
    Connection con;
    public Connector(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
      
        }catch(ClassNotFoundException e){
            System.err.println(e);
        }
        
        try{
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","");
        }catch(SQLException es){
            System.err.println(es);
        }
    }
    Connection obtenirconnexion(){   
        return con;
    }

    PreparedStatement PreparedStatement(String un) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
