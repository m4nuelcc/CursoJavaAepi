package Ejercicios_java_Aepi;

import java.util.Scanner;

/**
 *
 * @author MANU
 
un año es bisiesto si es divisible por cuatro, 
excepto los principios de año (los divisibles por 100), 
que para ser bisiestos deben de ser divisibles también por 400.
*/

public class E03_AnnosBisiestos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
       
        int EntradaAnno;
             
        System.out.println("Dime un Año por Favor:");
        
        EntradaAnno = sc.nextInt();
        
        
        if ((EntradaAnno % 4 == 0) && ((EntradaAnno % 100 != 0) || (EntradaAnno % 400 == 0))){
            System.out.print("el año es Bisiesto");
        }else{
            System.out.println("el año no es bisiesto");
        }
    }
    
}
