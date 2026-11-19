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
import modelo.Cliente;

public class ClienteRepositorio {

    private List<Cliente> clientes;

    public ClienteRepositorio() {
        clientes = new ArrayList<>();
    }

    public void guardar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listar() {
        return clientes;
    }

    public Cliente buscarPorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public boolean existe(int id) {
        return buscarPorId(id) != null;
    }

    public void eliminar(int id) {
        Cliente cliente = buscarPorId(id);

        if (cliente != null) {
            clientes.remove(cliente);
        }
    }
}




