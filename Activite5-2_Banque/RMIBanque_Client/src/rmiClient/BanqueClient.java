package rmiClient;

import javax.naming.InitialContext;

import metier.Compte;
import rmiService.IBanque;

public class BanqueClient {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();     // lit jndi.properties
            IBanque banque = (IBanque) ctx.lookup("banque");

            System.out.println(banque.creerCompte(new Compte(1, 5000)));
            System.out.println(banque.creerCompte(new Compte(1, 100)));
            System.out.println(banque.getInfoCompte(1));
            System.out.println(banque.getInfoCompte(99));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}