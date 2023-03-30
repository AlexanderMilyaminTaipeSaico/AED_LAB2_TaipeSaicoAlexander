/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import ejercicio3.*;

/**
 *
 * @author Acer
 */
public class Principal {
        public static void main(String[] args) {
        Cajoneria<Caja> cajoneria = new Cajoneria<>();
        
        // Agregar objetos a la cajoneria
        Caja<String> caja1 = new Caja<>("rojo");
        caja1.guardar("Objeto 1");
        cajoneria.add(caja1);
        
        Caja<Integer> caja2 = new Caja<>("amarillo");
        caja2.guardar(2);
        cajoneria.add(caja2);
        
        Caja<Double> caja3 = new Caja<>("verde");
        caja3.guardar(3.14);
        cajoneria.add(caja3);
        
        // Imprimir información de los objetos en la cajoneria
        System.out.println(cajoneria.toString());
    }
}

