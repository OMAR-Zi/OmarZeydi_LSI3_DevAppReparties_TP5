package rmiServer;

import java.rmi.registry.LocateRegistry;

import javax.naming.InitialContext;

import rmiService.BanqueImpl;

public class BanqueServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);           // démarre le registre RMI
            BanqueImpl banque = new BanqueImpl();
            InitialContext ctx = new InitialContext();     // lit jndi.properties
            ctx.rebind("banque", banque);
            System.out.println("Serveur RMI + JNDI prêt...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}