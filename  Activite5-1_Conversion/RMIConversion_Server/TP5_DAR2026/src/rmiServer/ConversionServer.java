package rmiServer;
import rmiService.ConversionImpl;

import javax.naming.InitialContext;
import java.rmi.registry.LocateRegistry;

public class ConversionServer {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);
            ConversionImpl conversion=new ConversionImpl();
            InitialContext ctx=new InitialContext();
            ctx.rebind("converBank",conversion);
            System.out.println("Serveur RMI + JNDI prêt...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
