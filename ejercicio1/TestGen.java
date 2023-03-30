/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Acer
 */
public class TestGen {
    public static <T> boolean exist(T[] array, T element) {
        for (T el : array) {
            if (el.equals(element)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        
        String[] v = {"Perez", "Sanchez", "Rogriguez"};
        Integer[] w = {12,34,56};
        
        System.out.println(exist(v,"Sanchez"));
        System.out.println(exist(w,34));
        System.out.println(exist(w,"Salas")); //Error
    }
}
