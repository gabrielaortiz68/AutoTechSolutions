/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author gabri
 */
import modelo.Cliente;
import repositorio.ClienteRepositorio;
import java.util.List;

public class ClienteControlador {

 private static final ClienteRepositorio repositorio = new ClienteRepositorio();

      public void registrarCliente(Cliente cliente) {

        if (cliente.getNombre().trim().isEmpty()
                || cliente.getIdentidad().trim().isEmpty()
                || cliente.getTelefono().trim().isEmpty()
                || cliente.getDireccion().trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Todos los campos son obligatorios."
            );
        }

        if (repositorio.existe(cliente.getId())) {
            throw new IllegalArgumentException(
                    "Ya existe un cliente con ese código."
            );
        }

        repositorio.guardar(cliente);
    }

    public List<Cliente> listarClientes() {
        return repositorio.listar();
    }

    public Cliente buscarCliente(int id) {
        return repositorio.buscarPorId(id);
    }

    public void eliminarCliente(int id) {
        repositorio.eliminar(id);
     }   
   public void modificarCliente(Cliente cliente) {
    Cliente existente = repositorio.buscarPorId(cliente.getId());

    if (existente == null) {
        throw new IllegalArgumentException("Cliente no encontrado.");
    }

    existente.setNombre(cliente.getNombre());
    existente.setIdentidad(cliente.getIdentidad());
    existente.setTelefono(cliente.getTelefono());
    existente.setDireccion(cliente.getDireccion());
}
}
