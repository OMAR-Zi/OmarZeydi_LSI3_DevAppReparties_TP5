package rmiClient;

import rmiService.IConversion;

import javax.naming.InitialContext;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            InitialContext ctx=new InitialContext();
            IConversion conversion=(IConversion) ctx.lookup("converBank");
            double resultat=conversion.convertirMontant(500);
            System.out.println("Résultat de la conversion : " + resultat);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
