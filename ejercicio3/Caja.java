/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Acer
 */
public class Caja<T> {
    private T contenido;
    private String color;

    public Caja(String color) {
        this.color = color;
    }
    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public T obtenerContenido() {
        return contenido;
    }

    public String getColor() {
        return color;
    }
}


