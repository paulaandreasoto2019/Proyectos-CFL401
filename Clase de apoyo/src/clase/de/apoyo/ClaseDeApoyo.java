/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.de.apoyo;

import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class ClaseDeApoyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int numeros;
        Scanner teclado = new Scanner (System. in);
        
        //nombre = teclado.nextLine();
       
       //System.out.println("Buenos dias");
        
        //numeros = teclado.nextInt();
        
        //System.out.println(numeros);
        
        try {
            numeros = teclado.nextInt();
            nombre = "Vamos a mostrar el contenido de la variable números";
            mostrar (nombre);
            System.out.println(numeros);
            
            mayor(numeros);// Aca le pongo el contenido de la variable números.
            
        }catch (Exception x) {
            System.out.println("Cometió un error al poner una letra");
            
            mostrar ("Hola Mundo");
            
        }
        
    }
    
    /**
    La función mostrar es para mostrar un mensaje por pantalla.
    * @param mensaje Necesita un String para poder funcionar.
    No devuelve nada.
    */
    public static void mostrar(String mensaje){//es una función que no me devuelve nada.
                                               //En el parametro me da un String que debo mostrar.
        System.out.println(mensaje);
    }
    
    public static void mayor(int num){
        
        if (num >= 0){
            
            System.out.println("Es un número positivo");
        }else{ 
            System.out.println("Es un número negativo");
        }
    }
}
