package Ejercicios_java_Aepi;

import java.util.Arrays;
import java.util.Scanner;

/*
Dime un texto: Hola clase

Letra - Posición - Cantidad
a     -  3 7      - 2
c     -  5       - 1
e     -  9       - 1
h     -  0       - 1
l     -  2 6      - 2
o     -  1       - 1
s     -  8       - 1
```

**Requisitos obligatorios:**
* Debemos de tener una función que devuelvan esos datos de un texto.
* El texto se debe de tratar para que podamos obtenerlo independientemente de si son mayusculasminusculastengan acentosetc.

/**
 *
 * @author MANU
 */
public class E24_AnalizarTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase:");
        String palabra = sc.nextLine().toLowerCase().trim();
        CuentaLetras(palabra);

    }

    public static void CuentaLetras(String palabra) {

        String Abecedario = "áéíóúabcdefghijklmnñopqrstuvwxyz0123456789";
        char abecedario[] = Abecedario.toCharArray();
        int control = 0;

        for (int i = 0; i < abecedario.length; i++) {
            String contadorPosiciones = "";
            byte contador = 0;
            for (int x = 0; x < palabra.length(); x++) {
                if ((palabra.charAt(x) == abecedario[i])) {
                    contadorPosiciones += Integer.valueOf(x) + ",";
                    contador++;

                }
            }
            if (contador > 0) {
                contadorPosiciones = contadorPosiciones.substring(0, contadorPosiciones.length() - 1);
                if (control == 0) {
                    System.out.println("la letra              posicion           cantidad  ");
                    control = 1;
                }

                System.out.println("    " + abecedario[i] + "                  " + contadorPosiciones + "                 " + contador);
                // System.out.println("La letra " + abecedario[i] + " aparece " + contador + " veces y en las posiciones " + contadorPosiciones);
            }
        }

    }
}
