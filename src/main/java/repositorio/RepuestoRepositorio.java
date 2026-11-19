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
import modelo.Repuesto;

public class RepuestoRepositorio {

    private List<Repuesto> repuestos;

    public RepuestoRepositorio() 
    {
        repuestos = new ArrayList<>();
    }

    public void guardar(Repuesto repuesto)
    {
        repuestos.add(repuesto);
    }

    public List<Repuesto> listar() 
    {
        return repuestos;
    }

    public Repuesto buscarPorId(int id) {
    for (Repuesto repuesto : repuestos) {
        if (repuesto.getId() == id) {
            return repuesto;
        }
    }
    return null;
}

public void eliminar(int id) {
    Repuesto repuesto = buscarPorId(id);

    if (repuesto != null) {
        repuestos.remove(repuesto);
    }
}
}