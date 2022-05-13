/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2_g2;
import static java.lang.Math.random;
import java.util.Scanner;
/**
 *Crea un array de números donde le indicamos por teclado el tamaño del array, 
 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra 
 * por pantalla el valor de cada posición y la suma de todos los valores.
 * Haz un método para rellenar el array (que tenga como parámetros los números
 * entre los que tenga que generar), para mostrar el contenido y la suma del 
 * array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
 * @author LABMOVIL
 */
public class Ejer2_g2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("introduce el tamaño");
        int largo = scan.nextInt();
        int[] posiciones = new int[largo];
        
        for (int i = 0; i < largo; i++){
            posiciones[i] = (int) (Math.random()*(10-1+1)+1);
            System.out.println(posiciones[i] + " +");
        
        }
         int suma = 0;       
          for (int i = 0; i < largo; i++){
           suma += posiciones[i];
        }  
          System.out.println("la suma total es " + suma);
    }
    
    
}

