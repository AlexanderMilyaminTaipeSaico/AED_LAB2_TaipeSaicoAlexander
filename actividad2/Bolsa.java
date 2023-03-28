/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Acer
 */
public class Bolsa <T> implements Iterable <T>{
    private ArrayList <T> lista = new ArrayList <T>();
    private int tope;
    
    public Bolsa(int tope){
        super();
        this.tope = tope;
    }
    public void add(T objeto){
        if (lista.size() >= tope){
            lista.add(objeto);
        }else{
            throw new RuntimeException("no caben mas");
        }
    }
    public Iterator <T> iterator(){
        return lista.iterator();
    }
}
