package Soluciones;

import java.util.Scanner;

public class triangulos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime una arista (Cm): ");
        float arista1 = sc.nextFloat();
        System.out.print("Dime una arista (Cm): ");
        float arista2 = sc.nextFloat();
        System.out.print("Dime una arista (Cm): ");
        float arista3 = sc.nextFloat();

        sc.close();

        if (arista1 + arista2 > arista3 && arista2 + arista3 > arista1 && arista3 + arista1 > arista2) {
            
            if (arista1 == arista2 && arista2 == arista3) {
                System.out.println("Es un triangulo equilátero");
            } 
            else if (arista1 != arista2 && arista2 != arista3 && arista3 != arista1) {
                System.out.println("Es un triangulo isósceles");
            }
            else 
            {
                System.out.println("Es un triangulo escaleno");
            }

        }
        else
        {
            System.out.println("No es un triangulo válido");
        }
        
    }
}