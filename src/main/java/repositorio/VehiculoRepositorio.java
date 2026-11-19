/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

/**
 *
 * @author gabri
 */
import java.util.ArrayList;
import java.util.List;
import modelo.Vehiculo;

public class VehiculoRepositorio {

    private List<Vehiculo> vehiculos;

    public VehiculoRepositorio() {
        vehiculos = new ArrayList<>();
    }

    public void guardar(Vehiculo vehiculo) {

        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(vehiculo.getPlaca())) {
                throw new IllegalArgumentException("La placa ya está registrada.");
            }
        }

        vehiculos.add(vehiculo);
    }

    public List<Vehiculo> listar() {
        return vehiculos;
    }

    public Vehiculo buscarPorId(int id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId() == id) {
                return vehiculo;
            }
        }

        return null;
    }

    public Vehiculo buscarPorPlaca(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                return vehiculo;
            }
        }

        return null;
    }

    public void eliminar(int id) {
        Vehiculo vehiculo = buscarPorId(id);

        if (vehiculo != null) {
            vehiculos.remove(vehiculo);
        }
    }
}

