package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;

public interface IConversion extends Remote {
    double convertirMontant(double mt) throws RemoteException;
}
