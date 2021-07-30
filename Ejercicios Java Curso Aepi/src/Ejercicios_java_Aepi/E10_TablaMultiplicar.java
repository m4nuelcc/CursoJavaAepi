/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_java_Aepi;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANU
 */
public class E10_TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un núemro por favor: ");
        
        int Numero =sc.nextInt(), Resultado;
       
        
        System.out.println(" 1 * " + Numero + " = " + (Resultado = 1 * Numero) );
        System.out.println(" 2 * " + Numero + " = " + (Resultado = 2 * Numero) );
        System.out.println(" 3 * " + Numero + " = " + (Resultado = 3 * Numero) );
        System.out.println(" 4 * " + Numero + " = " + (Resultado = 4 * Numero) );
        System.out.println(" 5 * " + Numero + " = " + (Resultado = 5 * Numero) );
        System.out.println(" 6 * " + Numero + " = " + (Resultado = 6 * Numero) );
        System.out.println(" 7 * " + Numero + " = " + (Resultado = 7 * Numero) );
        System.out.println(" 8 * " + Numero + " = " + (Resultado = 8 * Numero) );
        System.out.println(" 9 * " + Numero + " = " + (Resultado = 9 * Numero) );
        System.out.println(" 10 * " + Numero + " = " + (Resultado = 10 * Numero) );
         
    }
    
}
