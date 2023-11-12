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
public class MiColaPersonalizada {
   
    private Object[] elementos;
    private int tamaño;
    private static final int CAPACIDAD_INICIAL = 10;

    public MiColaPersonalizada() {
        elementos = new Object[CAPACIDAD_INICIAL];
        tamaño = 0;
    }

    public void agregar(Object elemento) {
        asegurarCapacidad();
        elementos[tamaño] = elemento;
        tamaño++;
    }

    public void eliminar() {
        if (tamaño == 0) {
            throw new IllegalStateException("La cola está vacía.");
        }

        for (int i = 0; i < tamaño - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamaño - 1] = null;
        tamaño--;
    }

    public Object obtener() {
        if (tamaño == 0) {
            throw new IllegalStateException("La cola está vacía.");
        }

        return elementos[0];
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
