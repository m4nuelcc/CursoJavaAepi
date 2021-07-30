package Soluciones;

import java.util.Scanner;

public class palindromos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean esPalindromo = true;
        
        System.out.print("Dime un texto: ");
        String textoEntrada = sc.nextLine();

        sc.close();

        byte posicion = 0;
        while (esPalindromo && posicion < Math.round(textoEntrada.length() / 2)) {
            if (textoEntrada.charAt(posicion) != textoEntrada.charAt(textoEntrada.length() - 1 - posicion)) {
                esPalindromo = false;
            }
            
            posicion++;
        }

        System.out.println(esPalindromo);
    }
}
