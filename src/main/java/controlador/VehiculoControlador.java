/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author gabri
 */
import modelo.Vehiculo;
import repositorio.VehiculoRepositorio;
import java.util.List;

public class VehiculoControlador {

   private static final VehiculoRepositorio repositorio = new VehiculoRepositorio();

public VehiculoControlador() {
}

    public void registrarVehiculo(Vehiculo vehiculo) {
        repositorio.guardar(vehiculo);
    }

    public List<Vehiculo> listarVehiculos() {
        return repositorio.listar();
    }

    public Vehiculo buscarVehiculo(int id) {
        return repositorio.buscarPorId(id);
    }

    public Vehiculo buscarPorPlaca(String placa) {
        return repositorio.buscarPorPlaca(placa);
    }

    public void eliminarVehiculo(int id) {
        repositorio.eliminar(id);
    }
}
