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

public class RepositorioGenerico<T> {

    private List<T> lista;

    public RepositorioGenerico() {
        lista = new ArrayList<>();
    }

    public void guardar(T objeto) {
        lista.add(objeto);
    }

    public List<T> listar() {
        return lista;
    }

    public void eliminar(T objeto) {
        lista.remove(objeto);
    }

    public int cantidad() {
        return lista.size();
    }
    
    public T obtener(int posicion) {
    if (!existe(posicion)) {
        return null;
    }
    return lista.get(posicion);
}
public boolean existe(int posicion) {
    return posicion >= 0 && posicion < lista.size();
}

}

