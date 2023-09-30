/*
 Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package ejercicio02excepciones;

import Entidad.Clase;
import Entidad.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author paola
 */
public class Ejercicio02Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        EJERCICIO 02 DE LA GUIA DE EXCEPCIONES
         */
//        String [] arreglo = new String [3];
//        Clase c1 = new Clase(arreglo);
// 
//        try {
//           String a = arreglo[1];
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("El indice esta fuera de rango");
//        }


         /*
         EJERCICIO 03 DE LA GUIA DE EXCEPCIONES
         */
        
         DivisionNumero dn = new DivisionNumero();
         dn.division();
         
    }

}
