/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilasYColas;

/**
 *
 * @author JEIFER ALCALA
 */
public class SolicitudCliente {
    private String cliente;
    private String problema;

    public SolicitudCliente(String cliente, String problema) {
        this.cliente = cliente;
        this.problema = problema;
    }

    // 

    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Problema: " + problema;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }
}