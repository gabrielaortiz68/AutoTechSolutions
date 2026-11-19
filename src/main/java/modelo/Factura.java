/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabri
 */
public class Factura {

    private int id;
    private OrdenTrabajo orden;
    private double subtotal;
    private double impuesto;
    private double total;
    private double pago;
    private double cambio;

    public Factura(int id, OrdenTrabajo orden, double subtotal,
            double impuesto, double pago) {

        this.id = id;
        this.orden = orden;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = subtotal + impuesto;
        this.pago = pago;
        this.cambio = pago - total;
    }

    public int getId() {
        return id;
    }

    public OrdenTrabajo getOrden() {
        return orden;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getTotal() {
        return total;
    }

    public double getPago() {
        return pago;
    }

    public double getCambio() {
        return cambio;
    }
}
