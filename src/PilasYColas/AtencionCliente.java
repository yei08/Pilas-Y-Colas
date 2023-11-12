/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilasYColas;

/**
 *
 * @author JEIFER ALCALA
 */
public class AtencionCliente {
    private MiColaPersonalizada colaSolicitudes;

    public AtencionCliente() {
        this.colaSolicitudes = new MiColaPersonalizada();
    }

    public void agregarSolicitud(String cliente, String problema) {
        SolicitudCliente nuevaSolicitud = new SolicitudCliente(cliente, problema);
        colaSolicitudes.agregar(nuevaSolicitud);
        System.out.println("Se agregó la solicitud de " + cliente + " a la cola.");
    }

    public void procesarSolicitudes() {
        while (colaSolicitudes.tamaño() > 0) {
            SolicitudCliente solicitud = (SolicitudCliente) colaSolicitudes.obtener();
            System.out.println("Procesando solicitud de " + solicitud);
            // Aquí puedes incluir la lógica para atender al cliente o cualquier otra acción necesaria
            colaSolicitudes.eliminar();
            System.out.println("Solicitud de " + solicitud.getCliente() + " procesada.");
        }
    }
}