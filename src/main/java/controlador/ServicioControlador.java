/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author gabri
 */
import modelo.Servicio;
import repositorio.ServicioRepositorio;
import java.util.List;

public class ServicioControlador {

    private static final ServicioRepositorio repositorio = new ServicioRepositorio();

public ServicioControlador() {
}

    public void registrarServicio(Servicio servicio) {
        repositorio.guardar(servicio);
    }

    public List<Servicio> listarServicios() {
        return repositorio.listar();
    }

    public Servicio buscarServicio(int id) {
        return repositorio.buscarPorId(id);
    }
    public void eliminarServicio(int id) {
    repositorio.eliminar(id);
}
    }





