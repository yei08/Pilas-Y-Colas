/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilasYColas;

/**
 *
 * @author JEIFER ALCALA
 */

public class ControlTraficoAereo {

    private MiPilaPersonalizada pilaAviones;

    public ControlTraficoAereo() {
        this.pilaAviones = new MiPilaPersonalizada();
    }

    public void agregarAvion(String tipo, String urgencia) {
        Avion nuevoAvion = new Avion(tipo, urgencia);
        pilaAviones.agregar(nuevoAvion);
        System.out.println("Se agregó un avión " + tipo + " con urgencia " + urgencia + " a la pila.");
    }

    public void procesarAviones() {
        while (pilaAviones.tamaño() > 0) {
            Avion avion = (Avion) pilaAviones.obtener();
            System.out.println("Procesando avión: " + avion);
            // Aquí puedes incluir la lógica para el aterrizaje o despegue del avión
            pilaAviones.eliminar();
            System.out.println("Avión " + avion.getTipo() + " procesado.");
        }
    }
}
