/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author gabri
 */
import modelo.OrdenTrabajo;
import repositorio.OrdenTrabajoRepositorio;
import java.util.List;

public class OrdenTrabajoControlador {

   private static final OrdenTrabajoRepositorio repositorio =
        new OrdenTrabajoRepositorio();

public OrdenTrabajoControlador() {
}

    public void registrarOrden(OrdenTrabajo orden) {
        repositorio.guardar(orden);
    }

    public List<OrdenTrabajo> listarOrdenes() {
        return repositorio.listar();
    }

    public OrdenTrabajo buscarOrden(int id) {
        return repositorio.buscarPorId(id);
    }
    public void eliminarOrden(int id) {
    repositorio.eliminar(id);
}
}