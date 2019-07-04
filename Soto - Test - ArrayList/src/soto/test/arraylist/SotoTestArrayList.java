/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soto.test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
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
      int dato,eleccionPat,eleccionEdad;
      String eleccionNom;
    
        //System.out.println("Buenas tardes");
       
        //ArrayList elem = new ArrayList();
        //ArrayList <Integer> elem2 = new ArrayList();
        //Scanner entrada = new Scanner(System.in);
        
        //dato = entrada.nextInt();
        
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
         
         try { //esto sirve para guardar los errrores.
            dato = entrada.nextInt();
            System.out.println(dato);
            
        }  catch (Exception e){
            System.out.println(e.toString());
        }         
        */ 
        ArrayList <Mascotas> mascotas = new ArrayList();
        
        
        //Mascotas perro1 = new Mascotas("Tory",4,22); //new sirve para crear un objeto nuevo
        //Mascotas gato1 = new Mascotas("Mish", 3, 10);
        //Mascotas loro1 = new Mascotas ("Poli", 2 , 25);
        
       // mascotas.add(perro1);//add le agrego a la cajita de la variable mascotas perro1 y 
        //mascotas.add(gato1);//asi con los dosotros anima
        //mascotas.add(loro1);
        
        //System.out.println(mascotas);
        
        //mascotas.add("Tory", 4 , 22);Esto esta mal
        mascotas.add(new Mascotas("Tory", 4, 22));//Aca la clase Mascotas se mete en la variable mascotas
        mascotas.add(new Mascotas("Mish", 3, 10)); //Se hace con los tres animales.
        mascotas.add(new Mascotas("Poli", 2, 25));//Aca no hace falta crear una nueva variable
        //System.out.println(mascotas);
        
        //System.out.println("Ingrese el nombre de su mascota");
         
        Scanner entrada = new Scanner(System. in);
         
         eleccionNom = entrada.nextLine();
         
         while(!eleccionNom.toUpperCase().equals("salir".toUpperCase())){
             
         //while(!eleccionNom.equals("salir")){//Quiere decir que eleccion cambia de false a true.
             
             eleccionPat = entrada.nextInt();//debo llenar las variables nates de meterlas en mascotas.
             eleccionEdad = entrada.nextInt();
            
             mascotas.add(new Mascotas(eleccionNom,eleccionPat,eleccionEdad));
             entrada.nextLine();
             eleccionNom = entrada.nextLine();
         }
          
         //System.out.println(mascotas);
         
         //Iterator te dice que hay adentro de cada cuadrado que se creo
         
         Iterator it = mascotas.iterator();//Iterator va a revisar a mascotas.
         
         //it.hasNext(); //esto se usa para decir preguntar si hay un proximo elemento y como respuesta da un true o false.
         //it.next();//next me va a dar el proximo elemento. esta dos lineas van juntas.
                   // primero pregunta y despues la busca.
                   
         while(it.hasNext()){
           
             Mascotas mascota = (Mascotas)it.next();
            
             System.out.println("El nombre de la mascota es: " + mascota.getNombre() + mascota.getPatas() + mascota.getEdad());
             

            //System.out.println(((Mascotas)it.next()).getNombre()) ;//itmuestra el siguiente elemento de la clase Mascotas
                                                                   //y despues le pregunta que le muestre el getNombre que esta dentro de mascotas
             
             
             
           
             
        
         }
         
         
             
         
        }
       
      
    }
    

