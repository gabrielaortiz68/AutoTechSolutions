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
import modelo.Factura;
public class FacturaRepositorio {
   private static final List<Factura> facturas = new ArrayList<>();
public FacturaRepositorio() {
}

    public void guardar(Factura factura) {
        facturas.add(factura);
    }

    public List<Factura> listar() {
        return facturas;
    }

    public Factura buscarPorId(int id) {
        for (Factura factura : facturas) {
            if (factura.getId() == id) {
                return factura;
            }
        }

        return null;
    }
}