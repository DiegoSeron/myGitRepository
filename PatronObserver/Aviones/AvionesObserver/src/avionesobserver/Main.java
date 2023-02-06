/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avionesobserver;

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
        // Instanciar el objeto que será Observado
        AvionLider avionLider = new AvionLider("Avión Lider");

        // Instanciar y registrar tres Observadores
        AvionPerseguidor avionPerseguidor1 = new AvionPerseguidor("Boeing 747");
        AvionPerseguidor avionPerseguidor2 = new AvionPerseguidor("Airbus A380");
        AvionPerseguidor avionPerseguidor3 = new AvionPerseguidor("B-52");
        avionLider.agregarAvion(avionPerseguidor1);
        avionLider.agregarAvion(avionPerseguidor2);
        avionLider.agregarAvion(avionPerseguidor3);

        avionLider.start();
    }

}
