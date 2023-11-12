/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilasYColas;

/**
 *
 * @author JEIFER ALCALA
 */
public class Avion {
    private String tipo;
    private String urgencia;

    public Avion(String tipo, String urgencia) {
        this.tipo = tipo;
        this.urgencia = urgencia;
    }

    

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Urgencia: " + urgencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }
}
