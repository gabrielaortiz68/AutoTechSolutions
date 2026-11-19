/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
package controlador;

import java.util.List;
import modelo.Factura;
import repositorio.FacturaRepositorio;

public class FacturaControlador {

    private static final FacturaRepositorio repositorio =
            new FacturaRepositorio();

    public void registrarFactura(Factura factura) {
        repositorio.guardar(factura);
    }

    public List<Factura> listarFacturas() {
        return repositorio.listar();
    }

    public Factura buscarFactura(int id) {
        return repositorio.buscarPorId(id);
    }
}