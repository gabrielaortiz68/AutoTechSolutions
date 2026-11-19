/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
package modelo;

public class OrdenTrabajo {

    private int id;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Servicio servicio;
    private String fecha;
    private String descripcion;
    private String estado;
    private double total;

    public OrdenTrabajo(int id, Cliente cliente, Vehiculo vehiculo,
            Servicio servicio, String fecha, String descripcion) {

        this.id = id;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.servicio = servicio;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = "Pendiente";
        this.total = servicio.getPrecio();
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public double getTotal() {
        return total;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTotal(double total) {
        this.total = total;
    }
public void setFecha(String fecha) {
    this.fecha = fecha;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
}