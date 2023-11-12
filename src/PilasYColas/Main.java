/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PilasYColas;

/**
 *
 * @author JEIFER ALCALA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***********************Ejemplo atencion al cliente***************************");
        AtencionCliente atencionCliente = new AtencionCliente();

        // Agregar solicitudes a la cola
        atencionCliente.agregarSolicitud("Juan Pérez", "ProblemaMenor");
        atencionCliente.agregarSolicitud("María Gómez", "ProblemaCritico");

        // Procesar las solicitudes en orden de llegada
        atencionCliente.procesarSolicitudes();

        System.out.println("*************************Ejemplo de Control de Trafico aereo**********************************");

        ControlTraficoAereo controlTrafico = new ControlTraficoAereo();

        // Agregar aviones a la pila
        controlTrafico.agregarAvion("Pasajero", "Normal");
        controlTrafico.agregarAvion("Carga", "Urgente");

        // Procesar los aviones en orden de urgencia (LIFO)
        controlTrafico.procesarAviones();

        System.out.println("*************************************Ejemplo del Flujo de Impresion****************************************");
        Impresora impresora = new Impresora();

        // Agregamos algunos documentos a la cola de impresión
        impresora.agregarDocumento("Documento 1");
        impresora.agregarDocumento("Documento 2");
        impresora.agregarDocumento("Documento 3");

        // Imprimimos los documentos de la cola de impresión
        impresora.imprimirDocumento();
        impresora.imprimirDocumento();
        impresora.imprimirDocumento();

        // Intentamos imprimir un documento cuando la cola de impresión está vacía
        try {
            impresora.imprimirDocumento();
        } catch (IllegalStateException e) {
            System.out.println("No hay más documentos en la cola de impresión.");
        }
    }

}
