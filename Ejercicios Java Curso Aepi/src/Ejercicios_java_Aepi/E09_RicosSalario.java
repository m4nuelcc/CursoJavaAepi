package Ejercicios_java_Aepi;

import java.util.Scanner;

/**
 *
 * @author MANU
 */
public class E09_RicosSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
                 
         System.out.println("¿Cuanto Dinero Tienes?");
         
         int MiDinero = sc.nextInt();
         
         int SuDinero = (1168000000/MiDinero)*100;
         System.out.println("Jeff Bezos - Tinene " + SuDinero+ " veces tu dinero");
         
         SuDinero = (1105000000/MiDinero)*100;
         System.out.println("Bill Gates - Tinene " + SuDinero+ " veces tu dinero");
         
         SuDinero = (1093000000/MiDinero)*100;
         System.out.println("Bernard Arnault & family - Tinene " + SuDinero+ " veces tu dinero");

         SuDinero = (904000000/MiDinero)*100;
         System.out.println("Warren Buffet - Tinene " + SuDinero+ " veces tu dinero");


         
         

         
        
    }
    
}
