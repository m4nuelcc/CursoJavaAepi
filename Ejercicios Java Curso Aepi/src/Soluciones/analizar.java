package Soluciones;

import java.util.ArrayList;
import java.util.Scanner;

public class analizar {

    static String texto = "";
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un texto: ");
        texto = sc.nextLine();

        sc.close();

        System.out.println(obtenerResumenTexto(texto));        
    }

    public static String obtenerResumenTexto(String texto) { 
        ArrayList<String> letras = new ArrayList<>();
        
        String salida = "Letra - Posiciones - Cantidad\n";

        for (char letra : texto.toCharArray()) {
            if (!letras.contains(Character.toString(letra))) {
                letras.add(Character.toString(letra));
                salida += letra + " - " + obtenerPosiciones(letra) + " - " + obtenerCantidad(letra) + "\n";
            }
        }

        return salida; 
    }

    public static int obtenerCantidad(char letraBuscada) {
        int cantidad = 0;

        for (int posicion = 0; posicion < texto.length(); posicion++) {
            if (texto.charAt(posicion) == letraBuscada) {
                cantidad++;
            }
        }

        return cantidad;
    }

    public static String obtenerPosiciones(char letraBuscada) {
        String posiciones = "";

        for (int posicion = 0; posicion < texto.length(); posicion++) {
            if (texto.charAt(posicion) == letraBuscada) {
                posiciones += posicion + ", ";
            }
        }

        return posiciones;
    }
}