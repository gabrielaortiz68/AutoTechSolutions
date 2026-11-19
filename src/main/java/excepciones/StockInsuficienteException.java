/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author gabri
 */
public class StockInsuficienteException extends Exception{

    private int cantidadFaltante;

    public StockInsuficienteException(String mensaje, int cantidadFaltante) 
    {
        super(mensaje);
        this.cantidadFaltante = cantidadFaltante;
    }

    public int getCantidadFaltante() 
    {
        return cantidadFaltante;
    }
}

