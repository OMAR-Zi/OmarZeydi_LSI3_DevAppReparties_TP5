package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion{
    private static final long serialVersionUID=1;
    public ConversionImpl() throws RemoteException {
        super();
    }

    @Override
    public double convertirMontant(double mt) {
        System.out.println("call received : convertirMontant(" + mt + ")");
        return mt*3.14;
    }
}
