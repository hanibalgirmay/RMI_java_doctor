/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author awet
 */
public interface optionIF extends Remote{
//    public boolean getlogin(String name,String pass)throws RemoteException;
    public String getOptions(String name)throws RemoteException;
    
}
