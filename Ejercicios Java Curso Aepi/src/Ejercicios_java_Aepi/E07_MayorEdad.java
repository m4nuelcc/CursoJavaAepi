
package Ejercicios_java_Aepi;
import java.util.Scanner;


/**
 *
 * @author MANU
 */
public class E07_MayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("en que año has nacido: ");
        int  agno = sc.nextInt();
        
        int edad = 0;
        
        edad = agno - 2021;
        
        if (edad >= 18){
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }
    
    }
    
}
