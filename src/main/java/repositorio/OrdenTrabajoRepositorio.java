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
import modelo.OrdenTrabajo;

public class OrdenTrabajoRepositorio{

    private List<OrdenTrabajo> ordenes;

    public OrdenTrabajoRepositorio() 
    {
        ordenes = new ArrayList<>();
    }

    public void guardar(OrdenTrabajo orden) 
    {
        ordenes.add(orden);
    }

    public List<OrdenTrabajo> listar() 
    {
        return ordenes;
    }

    public OrdenTrabajo buscarPorId(int id) {
        for (OrdenTrabajo orden : ordenes) {
            if (orden.getId() == id) {
                return orden;
            }
        }
        return null;
    }
    

public void eliminar(int id) {
    OrdenTrabajo orden = buscarPorId(id);

    if (orden != null) {
        ordenes.remove(orden);
    }
}
}

