/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Acer
 * @param <T>
 * @param <Caja>
 */
public class Cajoneria<T> implements Iterable<Caja<T>> {
    private ArrayList<Caja<T>> cajas = new ArrayList<Caja<T>>();
    private int tope;
 
 public Cajoneria(int tope) {
  super();
  this.tope = tope;
 }
 public Cajoneria() {
    super();
    this.tope = 0; // Límite predeterminado
  }
 
 public String search(Object elemento) {
    for (int i = 0; i < cajas.size(); i++) {
        Caja cajaActual = cajas.get(i);
        if (cajaActual.obtenerContenido() != null && cajaActual.obtenerContenido().equals(elemento)) {
            return "El elemento se encuentra en la caja " + (i + 1) + " de color " + cajaActual.getColor();
        }
    }
    return "El elemento no se encuentra en ninguna caja";
}
 public T delete(T elemento) {
    for (Caja<T> cajaActual : cajas) {
        if (cajaActual.obtenerContenido() != null && cajaActual.obtenerContenido().equals(elemento)) {
            T contenidoEliminado = cajaActual.obtenerContenido();
            cajaActual.guardar(null); // eliminamos el contenido de la caja
            return contenidoEliminado;
        }
    }
    return null;
}
 
 public void add(Caja objeto) {
  if (cajas.size() >= tope) {
   cajas.add(objeto);
  } else {
   throw new RuntimeException("no cabe mas");
  }
 }
 
 @Override
 public Iterator < Caja<T> > iterator() {
  return cajas.iterator();
 }
}

