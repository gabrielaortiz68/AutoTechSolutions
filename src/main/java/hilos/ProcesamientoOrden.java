/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author gabri
 */
import modelo.OrdenTrabajo;

public class ProcesamientoOrden extends Thread {

    private OrdenTrabajo orden;

    public ProcesamientoOrden(OrdenTrabajo orden) {
        this.orden = orden;
    }

    @Override
    public void run() {

        System.out.println("Procesando orden: " + orden.getId());

        try {
            Thread.sleep(3000);

            orden.setEstado("Procesada");

            System.out.println("Orden procesada correctamente.");

        } catch (InterruptedException e) {
            System.out.println("Error al procesar la orden.");
            Thread.currentThread().interrupt();
        }
    }
}
