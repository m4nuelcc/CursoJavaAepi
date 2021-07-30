package Ejercicios_java_Aepi;
/*
NumerosNoRepetidos
Dime cuantos numeros quieres: 4
3 8 4 2
Comentarios adicionales:
‚?ëDebemos pensar tantos n√∫meros aleatorios como sean necesarios, hasta que
obtengamos la cantidad de n√∫meros que nos indique el usuario, sin que
ninguno se repita y del 1 al 9 (inclusive).

/**
 *
 * @author MANU
 */

import java.util.Scanner;

public class E14_NumerosNoRepetidos {

    public static void main(String[] args) {
    
     int NumeroAleatorio;
     Scanner sc = new Scanner(System.in);
     System.out.println("Dime Cuantos numeros quieres:");
     
     int numero =Integer.parseInt(sc.nextLine());

     for (int i=0; i<numero; i++){
         
        NumeroAleatorio = (int)(Math.random()*10);
        System.out.print(NumeroAleatorio + " ");
         
         
     }
    }
    
}
