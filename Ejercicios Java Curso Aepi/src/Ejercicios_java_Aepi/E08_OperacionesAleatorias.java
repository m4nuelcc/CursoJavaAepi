package Ejercicios_java_Aepi;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author MANU
 */
public class E08_OperacionesAleatorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        int num = 0;
        int numeroAleatorio1 = rnd.nextInt(9) + 1;
        int numeroAleatorio2 = rnd.nextInt(9) + 1;
        String operador;
        
        int aleatorioOperacion = rnd.nextInt(3);
        int resultado=0;
        
        switch (aleatorioOperacion){
            case 0:
                resultado = numeroAleatorio1 + numeroAleatorio2;
                operador="+";
            break;  
            case 1:
                operador="-";
                resultado = numeroAleatorio1 - numeroAleatorio2;
            break;
            case 2:
                operador="*";
                resultado = numeroAleatorio1 * numeroAleatorio2;
            break;
            case 3:
                operador="/";
                resultado = numeroAleatorio1 / numeroAleatorio2;
            break;
            default: 
                operador="";
            }
               
        System.out.println("cual es el resultado de: " + numeroAleatorio1 + operador + numeroAleatorio2);
        System.out.println("Dime la respuesta:  " );
        num = sc.nextInt();
        
        if (resultado == num){
            
            System.out.println("El resultado es correcto");
        }else {
            System.out.println("!Has fallado¡ La respuesta es: " + resultado);
        }
    }
    
}
