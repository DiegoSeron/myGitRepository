/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author diego
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Instanciar el objeto que será Observado
         UnObservado objObservado = new UnObservado();
        // Instanciar y registrar un Observador
         UnObservador objObservadorPepe  = new UnObservador("Pepe");
         objObservado.agregarObservador(objObservadorPepe);
        // Instanciar y registrar otro Observador
        UnObservador objObservadorJuan  = new UnObservador("Juan");
        objObservado.agregarObservador(objObservadorJuan);
        // Instanciar y registrar otro Observador
        UnObservador objObservadorMarta = new UnObservador("Marta");
        objObservado.agregarObservador(objObservadorMarta);
    }
    
}
