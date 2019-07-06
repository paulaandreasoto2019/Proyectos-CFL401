/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soto.test.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Programación
 */
public class Persona {
    private String nombre;
    private int edad;
    private ArrayList <Mascotas> mascotas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        mascotas = new ArrayList();
     
    }
     public int agregarMascota(Mascotas mascota){//entre los parentesis tiene que estar lleno
      
         mascotas.add(mascota);
         
         return mascotas.size();
     }
    public int cuantasMascotasTenes(){
        
     return   mascotas.size();//Es para saber la cantidad de mascotas
        
        
    }
    
}
