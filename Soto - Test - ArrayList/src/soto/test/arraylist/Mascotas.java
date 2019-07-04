package soto.test.arraylist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programación
 */
public class Mascotas {
    public String nombre;
    public int patas;
    public int edad;

    public Mascotas(String nombre, int patas, int edad) {
        this.nombre = nombre;
        this.patas = patas;
        this.edad = edad;
    }
    
    public Mascotas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * El metodo getNombre es para conseguir el nombre del objeto
     * @return retorna el nombre
     */
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

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    
}
