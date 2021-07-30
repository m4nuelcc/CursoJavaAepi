package Ejercicios_java_Aepi;
/*
Pedimos 10 números y obtenemos los siguientes datos:

```
Dime un número: 3
Dime un número: 75
Dime un número: 223
Dime un número: 50
```

**Comentarios adicionales:**
* Tenemos que pedir 10 números en total y realizar los calculos con ello.

**Requisitos obligatorios:**
* No se puede utilizar las funciones del lenguaje de programación. Debemos crearlas nosotros.


/**
 *
 * @author MANU
 */
import java.util.Arrays;
import java.util.Scanner;

public class E27_MediaSumaMayorMenor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int[] Numeros = new int[10];
        //  int UltimoNumero = (Numeros.length)-1;

        while (contador < 10) {

            System.out.println("dime un numero " + contador + " de 10");
            String Entrada = sc.next();
            if (ValidacionNumeros(Entrada)) {
                //System.out.println(EntradaSoloNumeros(Entrada));
                Numeros[contador] = Integer.parseInt(Entrada);
                contador++;
            } else {

                System.out.println("por Favor Intyroduzca un Número:");
            }

        }
        Arrays.sort(Numeros);

        System.out.println("La media es: " + Media(Numeros) + "\n"
                + "La suma total: " + SumaTotal(Numeros) + "\n"
                + "El número mayor es: " + Numeros[Numeros.length - 1] + "\n"
                + "El número menor es: " + Numeros[0]);

    }

    public static double Media(int numerosMedia[]) {

        double Resultado = 0;
        Resultado = SumaTotal(numerosMedia) / numerosMedia.length;
        return Resultado;
    }

    public static double SumaTotal(int numeros[]) {

        int media = 0;
        double Resultado = 0;
        for (int numero : numeros) {
            Resultado = media += numero;
        }
        return Resultado;
    }

    //**************************************************************************
    // ValidaNumeros Funcion que valida si la entrada es un numero 
    public static boolean ValidacionNumeros(String Entrada) {

        boolean control = false;
        int contador = 0;
        String Numeros = "0123456789";

        for (int i = 0; i < Numeros.length(); i++) {

            for (int x = 0; x < Entrada.length(); x++) {

                if (Numeros.charAt(i) == Entrada.charAt(x)) {

                    contador++;
                }
            }
            if (contador == Entrada.length()) {
                control = true;
            }

        }

        return control;
    }

}
