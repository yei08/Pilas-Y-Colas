/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilasYColas;

/**
 *
 * @author JEIFER ALCALA
 */

public class Impresora {

 private MiPilaPersonalizada pila;

    public Impresora() {
        pila = new MiPilaPersonalizada();
    }

    public void agregarDocumento(String documento) {
        pila.agregar(documento);
    }

    public void imprimirDocumento() {
        if (pila.tamaño() == 0) {
            throw new IllegalStateException("La pila está vacía.");
        }

        String documento = (String) pila.obtener();
        pila.eliminar();
        System.out.println(documento);
    }
}

