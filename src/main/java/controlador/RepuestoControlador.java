/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author gabri
 */
import modelo.Repuesto;
import repositorio.RepuestoRepositorio;
import java.util.List;

public class RepuestoControlador {

    private RepuestoRepositorio repositorio;

    public RepuestoControlador() {
        repositorio = new RepuestoRepositorio();
    }

    public void registrarRepuesto(Repuesto repuesto) {
        repositorio.guardar(repuesto);
    }

    public List<Repuesto> listarRepuestos() {
        return repositorio.listar();
    }

    public Repuesto buscarRepuesto(int id) {
        return repositorio.buscarPorId(id);
    }
public void eliminarRepuesto(int id) {
    repositorio.eliminar(id);
}
}