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
public class UnObservador implements IObservador{
     private String nombre;

    // ---------------------------------

    public UnObservador(String nombre) {
        this.setNombre(nombre);
        System.out.println("Observador [" + this.nombre + "] creado");
    }

    // ---------------------------------

    public String getNombre() {
        return this.nombre;
    }

    // ---------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ---------------------------------

    @Override
    public void observadoActualizado() {
      System.out.println("Observador [" + this.getNombre() + "] recibe la notificación");
    }
}
