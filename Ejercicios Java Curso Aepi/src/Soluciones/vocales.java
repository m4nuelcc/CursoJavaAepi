package Soluciones;

import java.util.Scanner;

public class vocales {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una letra: ");
        sc.close();

        String letra = sc.nextLine().toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");

        if (letra.length() == 1) {
            
            if (letra.charAt(0) >= '0' && letra.charAt(0) <= '9')
                System.out.println("Es un número");
            else if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))
                System.out.println("Es una vocal");
            else
                System.out.println("Es una consonante");

        } else {
            System.out.println("El tamaño de la letra debe de ser de 1.");
        }

    }
}