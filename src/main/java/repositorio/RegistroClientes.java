/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

/**
 *
 * @author gabri
 */
import java.util.HashMap;
import modelo.Cliente;

public class RegistroClientes {

    private HashMap<Integer, Cliente> clientes;

    public RegistroClientes() {
        clientes = new HashMap<>();
    }

    public void guardar(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }

    public Cliente buscar(int id) {
        return clientes.get(id);
    }

    public void eliminar(int id) {
        clientes.remove(id);
    }

    public int cantidad() {
        return clientes.size();
    }
}
