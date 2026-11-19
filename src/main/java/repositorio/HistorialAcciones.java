/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

/**
 *
 * @author gabri
 */
import java.util.Stack;

public class HistorialAcciones {

    private Stack<String> historial;

    public HistorialAcciones() {
        historial = new Stack<>();
    }

    public void registrarAccion(String accion) {
        historial.push(accion);
    }

    public String deshacerAccion() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }

        return null;
    }

    public boolean hayAcciones() {
        return !historial.isEmpty();
    }
}
