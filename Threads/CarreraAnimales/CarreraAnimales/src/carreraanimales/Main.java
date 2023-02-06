/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraanimales;

/**
 *
 * @author diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Corredor corredor1 = new Corredor("Liebre");
        Corredor corredor2 = new Corredor("Tortuga");
        Corredor corredor3 = new Corredor("Alberto");
        Corredor corredor4 = new Corredor("Cucaracha");
        Corredor corredor5 = new Corredor("Caracol");
        Pista pista = new Pista(100);
        pista.setCorredores(corredor1, corredor2, corredor3, corredor4, corredor5);
        pista.empezarCarrera();
    }

}
