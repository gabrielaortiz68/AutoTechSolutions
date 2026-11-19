/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Servicio;

public class ServicioRepositorio {

    private List<Servicio> servicios;

    public ServicioRepositorio() {
        servicios = new ArrayList<>();
    }

    public void guardar(Servicio servicio) {
        servicios.add(servicio);
    }

    public List<Servicio> listar() {
        return servicios;
    }

    public Servicio buscarPorId(int id) {
        for (Servicio servicio : servicios) {
            if (servicio.getId() == id) {
                return servicio;
            }
        }
        return null;
    }

    public void eliminar(int id) {
        Servicio servicio = buscarPorId(id);

        if (servicio != null) {
            servicios.remove(servicio);
        }
    }
}