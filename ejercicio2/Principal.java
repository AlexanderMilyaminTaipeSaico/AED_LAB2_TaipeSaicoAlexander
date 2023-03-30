/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import actividad7.*;
import actividad4.*;

/**
 *
 * @author Acer
 */
public class Principal {

 public static void main(String[] args) {
  Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>();
  Bolsa<Golosina> bolsaGo = new Bolsa<Golosina>();
  
  Chocolatina c = new Chocolatina("milka");
  Chocolatina c1 = new Chocolatina("milka");
  Chocolatina c2 = new Chocolatina("ferrero");
  
  Golosina g = new Golosina("Chicle", 0.1);
  Golosina g1 = new Golosina("Gomita", 0.2);
  Golosina g2 = new Golosina("Caramelo", 0.3);

  bolsaGo.add(g);
  bolsaGo.add(g1);
  bolsaGo.add(g2);
  
  bolsaCho.add(c);
  bolsaCho.add(c1);
  bolsaCho.add(c2);

  System.out.println("CHOCOLATINAS");
  for (Chocolatina chocolatina: bolsaCho) {

   System.out.println(chocolatina.getMarca());
  }
  System.out.println("GOLOSINAS");
  for (Golosina golosina: bolsaGo) {

   System.out.println("Nombre: " + golosina.getNombre()+ "\nPeso: " + golosina.getPeso());
  }

 }

}
