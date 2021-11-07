import java.rmi.RemoteException;

import java.rmi.Remote;

public interface StringInterface extends Remote {

    public boolean checkExit(String str) throws RemoteException;
    
    public String upperCase(String str) throws RemoteException;

    public String reverse(String str) throws RemoteException;
}
