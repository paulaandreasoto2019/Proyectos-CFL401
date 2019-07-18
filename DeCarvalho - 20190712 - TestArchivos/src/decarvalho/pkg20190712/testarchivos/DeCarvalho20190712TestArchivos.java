/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decarvalho.pkg20190712.testarchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Programación
 */
public class DeCarvalho20190712TestArchivos {
  private static  VentanaLogin ventanaLogin;
    

  private static  Ventana ventana;
    

  
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
    //FileWriter, es la clase que me permite comunicarme con un ARCHIVO
    //FileWriter file(nombre variable) = new FileWriter(ruta al archivo, si se sobre escrive o no)
    
    //FileWriter file = new FileWriter ("texto.txt", false); //el false hace que se sobre escriba, el true hace que se sigan creando archivos. Si no esta el archivo lo genera.
    //PrintWriter escritor = new PrintWriter (file);//Manejador. Maneja las interaccionas. poniendo el punto se accede a las acciones que se pueden hacer.
    //escritor.println("¿Cómo estás?");
    //escritor.print("Edad: ");
    //escritor.print(JOptionPane.showInputDialog(null, "Escribi algo"));//lo que escriba el usuario queda guardado en el archivo.
    
    //antes del close se hace un flush, las partes que quedan en el buffer que corresponder al arcivos las manda al archivo.
    //escritor.flush();
    //escritor.close();// así se cierra el archivo.
   
    //para leer el archivo. Generamos el link al archivo.
    //FileReader fileR = new FileReader ("texto.txt");
    //BufferedReader lector = new BufferedReader (fileR);//el que me permite utilizar el link.
    
    //Para leer entradas de texto
    //String textoEntrada = lector.readLine();//lee por líneas. Guarda en la variable textoEntrada lo que lee.
    //Cuando quiera leer algo y no hay nada va a llenar la variable con el valor null.
    
   // while (textoEntrada != null){
       // System.out.println(textoEntrada);
        //textoEntrada = lector.readLine();//para que lea la siguiente línea, sino va a seguir leyendo la primer linea del archivo infinitamente.
        
    //}
    
    //lector.close();
    
    
    //FileWriter conver = new FileWriter ("Conver.txt", true);
    //PrintWriter escritor2 = new PrintWriter (conver);
    //escritor2.println("Tomás: Hola");
    //escritor2.println("Franco: Hola");
    //escritor2.println("Franco: Todo bien?");
    //escritor2.println("Tomás: Me confundí");
    //escritor2.println("Tomás: Chau");
    
    //escritor2.flush();
    //escritor2.close();
    
    //FileReader fileRR = new FileReader ("conver.txt");
    //BufferedReader lector2 = new BufferedReader (fileRR);
    //textoEntrada = lector2.readLine();
    //Para separar cosas en Java tenemos el split.
    
    //while (textoEntrada != null){
    //String[] tP = textoEntrada.split(":");//Transformamos la primer fila de la conversacion en un array para poder separar
    //System.out.println(tP [0]);
    //System.out.println(tP [1]+ "\n");
    //System.out.println("");
    //System.out.println("\n" + tP[0] + "\n" + tP[1] );
    //textoEntrada = lector2.readLine();
    
    
    //La documentación java generalmente se hace antes de cada método
    /**Imprime el documento en la impresora seleccionada y necesita
     * por paramétro un documento. (@param documento)
     * @param documento
     * @param nombreVariable si hay más parámetro en el metódo.
     * @return valor de si imprimió o no
     */
    
    //alt+shift+f acomoda el codigo.
    
    
    //testeo test = new testeo();//objeto que tiene esta estructura.
    //testeo test2 = new testeo();
    
   // test.setApellido("Firu");
    //test2.setApellido("LG");
    //System.out.println(test.getApellido());
   // System.out.println(test2.getApellido());//Aca le pregunto a ese objeto su apellido
    
   // test.setApellido("Firu");
    //System.out.println(test.getApellido());
    //System.out.println(test2.getApellido());
    
    //testeo.setApellido("Loco");//le preguntamos a la clase directamente el apellido
    //
    
    //System.out.println(testeo.getApellido());
    
    mostrarLogin();
    
    }
    
    
    //Ventana ventana = new Ventana();
    //ventana.setVisible(true);
    /**
     * El metodo ventanaLogin es para mostar la ventana del login.
     */
    
    public static void mostrarLogin(){
        
        ventanaLogin = new VentanaLogin();
        ventanaLogin.setVisible(true);//es para hacer visible el objeto.
        
        
       
    }
    public static void mostrarVentanaPrincipal(){
     
        
        ventanaLogin.setVisible(false);
        
        ventana = new Ventana();
        
       ventana.setVisible(true);
        
        
    }
    
    }
    
//}
