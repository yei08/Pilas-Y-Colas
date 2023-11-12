/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilasYColas;
import java.util.Arrays;
/**
 *
 * @author JEIFER ALCALA
 */


public class MiListaPersonalizada {
   
    private Object[] elementos;
    private int tamaño;
    private static final int CAPACIDAD_INICIAL = 10;

    public MiListaPersonalizada() {
        elementos = new Object[CAPACIDAD_INICIAL];
        tamaño = 0;
    }

    public void agregar(Object elemento) {
        asegurarCapacidad();
        elementos[tamaño] = elemento;
        tamaño++;
    }
    
    public void eliminar(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        for (int i = indice; i < tamaño - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamaño - 1] = null;
        tamaño--;
    }

    public void actualizar(int indice, Object nuevoElemento) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        elementos[indice] = nuevoElemento;
    }

    public Object obtener(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        return elementos[indice];
    }

    public int tamaño() {
        return tamaño;
    }

    private void asegurarCapacidad() {
        if (tamaño == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }
   
    }
        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamaño; i++) {
            sb.append(elementos[i]);
            if (i < tamaño - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}