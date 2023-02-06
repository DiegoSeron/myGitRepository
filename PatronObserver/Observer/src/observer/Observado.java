/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public abstract class Observado {
        private ArrayList<IObservador> observadores = new ArrayList<IObservador>();

    // ---------------------------------

    public Observado() {
    }

    // ---------------------------------

    public void agregarObservador(IObservador o)
    {
        observadores.add(o);
        // Según nuestro ejemplo, cada vez que se agregue un nuevo observador, los existentes serán notificados
        notificarObservadores();
    }

    // ---------------------------------

    public void eliminarObservador(IObservador o) {
        observadores.remove(o);
    }

    // ---------------------------------

    public void notificarObservadores()
    {
        // Enviar la notificación a cada observador a través de su propio método
        for (IObservador obj : observadores) {
            obj.observadoActualizado();
        }
    }
}
