/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soto.test.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class SotoTestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dato;
      
        //System.out.println("Buenas tardes");
       
        //ArrayList elem = new ArrayList();
        ArrayList <Integer> elem2 = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        dato = entrada.nextInt();
        
        //elem.add("Perro");//.add sirve para agregar a la variable elem
        //elem.add(4);
        //elem.add((7));
       //System.out.println(elem);
       
       //System.out.println("Ingrese un número");
       
       
     /*
        while(dato >= 0){
         elem2.add(dato);
         dato = entrada.nextInt(dato);
        
         
         
           
           
       }
        System.out.println(elem2);   
         */  
        try { //esto sirve para guardar los errrores.
            dato = entrada.nextInt();
            System.out.println(dato);
            
        }  catch (Exception e){
            System.out.println(e.toString());
        }           
        
        
       }
       
      
    }
    

