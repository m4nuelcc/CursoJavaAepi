package Soluciones;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Dime un número: ");
        long numero = sc.nextShort();
        long factorial = 1;

        if (numero < 1) {
            System.out.println("No se puede obtener el factorial.");
        } else {
        
            for (long i = 2; i < numero + 1; i++){
                factorial *= i;
            }
            
            System.out.println("El factorial es " + factorial);
        }

    }
}