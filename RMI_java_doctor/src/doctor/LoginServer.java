/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;
import Client.choose_sickness;
import chat.ChatImpl;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author awet
 */
public class LoginServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
//            Registry registry = LocateRegistry.createRegistry(1099);
//            LoginImplement lp = new LoginImplement();
//            registry.rebind("login", lp);
            Registry registry = LocateRegistry.createRegistry(1099);
            choose_sickness lp = new choose_sickness();
            registry.rebind("option", lp);
            
            Registry reg = LocateRegistry.createRegistry(3999);
            ChatImpl CI = new ChatImpl();            
            reg.rebind("chat", CI);
            System.out.println("server is successfully running...");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
